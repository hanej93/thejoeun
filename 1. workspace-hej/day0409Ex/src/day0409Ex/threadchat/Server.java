package day0409Ex.threadchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {

		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {

			ServerSocket serverSocket = new ServerSocket(7777);

			System.out.println(">>> 접속 대기중...⏳⏳");
			socket = serverSocket.accept();
			System.out.println("클라이언트-" + socket.getInetAddress());
			System.out.println("접속 성공 😁");
			System.out.println();
			System.out.println();

			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

			
			Thread readThread = new TcpReader(br);
			Thread writeThread = new TcpWriter(bw);

			readThread.start();
			writeThread.start();

			readThread.join(); // readThread 가 끝나기 전까지 기다린다.
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("종료!!");
		}

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
