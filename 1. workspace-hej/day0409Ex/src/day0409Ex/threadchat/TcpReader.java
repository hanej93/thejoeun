package day0409Ex.threadchat;

import java.io.BufferedReader;
import java.io.IOException;

public class TcpReader extends Thread {
	
	BufferedReader br;
	
	
	
	public TcpReader(BufferedReader br) {
		this.br = br;
	}



	@Override
	public void run() {
		
		try {
			while (true) {
				System.out.println("클라이언트: " + br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
