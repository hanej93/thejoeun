package day0409Homework2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientWriter extends Thread {
	private Socket socket;
	private String name;

	public TcpClientWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"))) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("아이디를 입력해주세요!");
			this.name = sc.next();
			bw.write("<<[" + name + "] 님이 채팅방에 입장하였습니다.>>");
			bw.newLine();
			bw.flush();
			System.out.println("채팅방에 입장하였습니다 😁😁");
			sc.nextLine();
			String msg;
			while (true) {
				msg = sc.nextLine();
				if (msg.equals("quit")) {
					System.out.println("채팅방 종료!");
					bw.write("<<[" + name + "] 님이 채팅방에서 나가셨습니다>>");
					bw.newLine();
					bw.flush();
					break;
				}
				bw.write("[" + name + "] : " + msg);
				bw.newLine();
				bw.flush();
				
			}
			

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
