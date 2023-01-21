package day0409.tcpEx02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyTcpServerUseWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			ServerSocket serverSocket = new ServerSocket(7777);

			System.out.println(">>> 접속 대기중...⏳⏳");
			Socket socket = serverSocket.accept();
			

			System.out.println("클라이언트-" + socket.getInetAddress());
			System.out.println("접속 성공 😁");
			System.out.println();
			System.out.println();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			while (true) {
				String msg = br.readLine();
				
				System.out.println("클라이언트: " + msg);

				System.out.print("서버: ");
				String sendMsg = sc.nextLine() + "\n";
				bw.write(sendMsg);
				bw.flush();
				if(sendMsg.equals("exit\n")) {
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
