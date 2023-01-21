package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyTcpClient {
	public static void main(String[] args) {
		
		
		// 접속할 ip주소와 접속할 포트번호를 넣고 소켓객체를 생성한다.
		
		System.out.println("서버 소켓에 연결~");
		
		try(Socket socket = new Socket("182.213.13.184",7777);
				//서버쪽 소켓과 연결관 소켓에서 InputStream을 가져옴
				BufferedReader br = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//서버쪽 소켓과 연결관 소켓에서 OutputStream을 가져옴
				BufferedWriter bw = 
						new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){

			System.out.println("서버와 연결이 됨");
			
//			String msg = br.readLine();
//			System.out.println("서버로 부터 읽은 메시지1: " + msg);
//			msg = br.readLine();
//			System.out.println("서버로 부터 읽은 메시지2: " + msg);
			
			
			String msg = null;
			while((msg = br.readLine()) !=null ) {
				System.out.println(msg);
			}
			
//			bw.write("안녕서버야!! 나는 클라이언트라고해\n");
			while(true) {
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				
				bw.write(str);
				
				bw.flush();
				if(str.equals("끝")) {
					break;
				}
			}
			
			
			System.out.println("클라이언트 종료");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
