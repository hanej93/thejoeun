package day0409.tcpEx03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class TcpClientReader implements Runnable {

	private Socket socket;

	public TcpClientReader(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"))) {

			while (true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println("서버: " + msg);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Reader 종료!");
		}
	}

}
