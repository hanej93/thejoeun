package day0409Homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.List;

public class TcpServerReader extends Thread {
	private List<Socket> socketList;
	private BufferedWriter bw;
	private Socket socket;

	public TcpServerReader(List<Socket> socketList, Socket socket) {
		this.socketList = socketList;
		this.socket = socket;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(socket.getInputStream(), "utf-8"))) {


			String receiveMsg;
			while (true) {
				receiveMsg = br.readLine();
				if (receiveMsg == null) {
					socketList.remove(socket);
					break;
				}
				
				for (Socket socket : socketList) {
					if(socket == this.socket) {
						continue;
					}
						bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
						bw.write(receiveMsg);
						bw.newLine();
						bw.flush();
				}
				
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("클라이언트 접속 해제");
		}
	}


}
