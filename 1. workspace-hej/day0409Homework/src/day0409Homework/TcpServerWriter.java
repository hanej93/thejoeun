package day0409Homework;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class TcpServerWriter extends Thread {
	private Socket socket;
	private String msg;
	public TcpServerWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"))){
		
			while(true) {
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

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
