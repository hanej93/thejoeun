package day0409.tcpEx03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		
		try(Socket socket = new Socket("localhost",7777)){
			Thread w = new Thread(new TcpClientWriter(socket));
			w.start();
			
			w.join(); // 쓰레드가 종료될 때까지 기다린다!
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("TcpClient 종료!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
