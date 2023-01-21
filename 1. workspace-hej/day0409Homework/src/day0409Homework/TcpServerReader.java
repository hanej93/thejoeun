package day0409Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.List;

public class TcpServerReader extends Thread {
	Socket socket;
	private List<TcpServerReader> thList1;
	private String msg;
	String name;
	BufferedWriter bw;

	public TcpServerReader(Socket socket, List<TcpServerReader> thList1) {
		this.socket = socket;
		this.thList1 = thList1;

		
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"))) {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
//			for (int i = 0; i < thList1.size(); i++) {
//				String name = thList1.get(i).name;
//				
//				thList1.get(i).bw.write("["+name +"]님이 채팅창에 입장하셨습니다!");
//				thList1.get(i).bw.newLine();
//				thList1.get(i).bw.flush();
//			}
			while (true) {
				msg = br.readLine();
				if (msg == null) {
					break;
				}
				for (int i = 0; i < thList1.size(); i++) {
					String name = thList1.get(i).name;
					
					thList1.get(i).bw.write("["+name +"]" + msg);
					thList1.get(i).bw.newLine();
					thList1.get(i).bw.flush();
				}

			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Reader 종료!");
		}
	}

	public String getMsg() {
		return msg;
	}

}
