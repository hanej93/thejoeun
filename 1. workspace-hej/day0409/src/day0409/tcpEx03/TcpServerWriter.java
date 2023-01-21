package day0409.tcpEx03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class TcpServerWriter implements Runnable {
	private Socket socket;
//	private TcpReader reader;

	public TcpServerWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"))){
			Scanner sc = new Scanner(System.in);
			
			TcpClientReader r = new TcpClientReader(socket);
			Thread readerThread = new Thread(r);
			// 쓰레드를 데몬쓰레드로 만든다.
			// 쓰레드를 만든 부모쓰레드가 종료되면 같이 종료된다.
			readerThread.setDaemon(true);
			
			// 쓰레드 시작
			readerThread.start();
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
