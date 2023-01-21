package day0409.tcpEx03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("클라이언트 접속 대기중....");
			Socket socket = serverSocket.accept();
			
			System.out.println("클라이언트와 접속하였습니다.");

			Thread w = new Thread(new TcpClientWriter(socket));
			System.out.println("시작!");
			w.start();
			
			w.join();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("TcpServer 종료!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
