package day0409Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientReader extends Thread {
	Socket socket;
	String name;
	
	public TcpClientReader(Socket socket) {
		this.socket = socket;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요!");
		this.name = sc.next();
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"))) {

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					break;
				}
				System.out.println(msg);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Reader 종료!");
		}
	}

}
