package day0409Homework2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(7777);

			List<Socket> socketList = new ArrayList<Socket>();

			
			while (true) {
				System.out.println("클라이언트와의 접속 대기중...⏳⏳");
				Socket socket = serverSocket.accept();
				System.out.println("서버에 접속되었습니다 😁 ");
				socketList.add(socket);
				TcpServerReader tsr = new TcpServerReader(socketList, 
						socket);
				tsr.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
