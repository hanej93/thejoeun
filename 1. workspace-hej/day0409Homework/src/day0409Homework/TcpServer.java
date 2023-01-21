package day0409Homework;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {

			int cntThread = 0;
			serverSocket = new ServerSocket(7777);
			List<TcpServerReader> thList1 = new ArrayList<>();
//			List<TcpServerWriter> thList2 = new ArrayList<>();
			while (true) {

				System.out.println("클라이언트 접속 대기중....");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트와 접속하였습니다.");
				thList1.add(new TcpServerReader(socket, thList1));

				thList1.get(cntThread++).start();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
