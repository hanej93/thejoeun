package day0409Homework;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientWriter extends Thread {
	private Socket socket;

	public TcpClientWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"))){
			Scanner sc = new Scanner(System.in);
		
			String msg;
			while(true) {
				msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				if(msg.equals("quit")) {
					break;
				}
			}
			System.out.println("TcpWriter 종료!");
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
