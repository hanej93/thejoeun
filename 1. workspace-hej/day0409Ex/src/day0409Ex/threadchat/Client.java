package day0409Ex.threadchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			socket = new Socket("192.168.1.62", 9121);
			System.out.println("서버 접속 성공 😁");
			System.out.println();
			System.out.println();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

			Thread readThread = new TcpReader(br);
			Thread writeThread = new TcpWriter(bw);

			readThread.start();
			writeThread.start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
