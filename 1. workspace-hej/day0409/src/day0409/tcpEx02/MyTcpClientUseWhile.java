package day0409.tcpEx02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyTcpClientUseWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			Socket socket = new Socket("localhost", 7777);

			System.out.println("서버 접속 성공 😁");
			System.out.println();
			System.out.println();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			
			
			while (true) {
				System.out.print("클라이언트: ");
				String sendMsg = sc.nextLine() + "\n";
				bw.write(sendMsg);
				bw.flush();
				String msg = br.readLine();
				System.out.println("서버: " + msg);
				
				if(sendMsg.equals("exit\n")) {
					break;
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
