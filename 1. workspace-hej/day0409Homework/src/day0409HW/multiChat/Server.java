package day0409HW.multiChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	private ServerSocket serversocket;
	private List<Server.User> userList;

	public Server(int port) throws IOException {
		serversocket = new ServerSocket(port);
		userList = new ArrayList<Server.User>();
	}

	public void runServer() throws IOException {
		while (true) {
			Socket socket = serversocket.accept();
			User user = new User(socket);
			userList.add(user);
			user.start();
		}
	}

	private class User extends Thread {
		private String name;
		private Socket socket;
		private BufferedWriter bw;

		User(Socket socket) throws UnsupportedEncodingException, IOException {
			this.socket = socket;
			this.bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
		}

		@Override
		public void run() {
			BufferedReader br = null;
			try {
				System.out.println("### 서버 스레드 실행 ###");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
				bw.write("이름을 입력하세요.");
				bw.newLine();
				bw.flush();
				System.out.println("### 서버 송출 ###");
				this.name = br.readLine();
				for (User user : userList) {
					if (this != user) {
						user.bw.write(name + "님이 접속했습니다.");
						user.bw.newLine();
						user.bw.flush();
					}
				}
				String msg = null;
				while (true) {
					msg = br.readLine();
					for (User user : userList) {
						if (this != user) {
							user.bw.write(name + " : " + msg);
							user.bw.newLine();
							user.bw.flush();
						}
					}
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				userList.remove(this);
				e.printStackTrace();
				for (User user : userList) {
					if (this != user) {
						try {
							user.bw.write(name + "님이 나갔습니다.");
							user.bw.newLine();
							user.bw.flush();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		}
	}

}
