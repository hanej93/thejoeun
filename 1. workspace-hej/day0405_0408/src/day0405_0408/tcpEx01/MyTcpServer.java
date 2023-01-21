package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcpServer {
	public static void main(String[] args) {

		// tcp의 서버
		
		Socket socket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {

			// 서버 소켓 생성: 접속받을 포트를 넣어서 만든다
			System.out.println("서버소켓 생성");
			ServerSocket serverSocket = new ServerSocket(7777);

			// 서버소켓의 accept() 요청을 받을 때까지 대기
			System.out.println("요청 대기중...");
			socket = serverSocket.accept();

			// 클라이언트와 연결된 소켓으로 인풋스트림과 아웃풋스트림을 가져온다.
			System.out.println("인풋스트림과 아웃풋스트림을 받아온다.");

			// socket.getInputStream()로 클라와 연결된 inputStream을 가져옴
			// InputStreamReader를 통해 inputStream을 reader로 변경함
			// BufferedReader로 가공함
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));

			// socket.getOutputStream()로 클라와 연결된 OutputStream을 가져옴
			// OutputStreamWriter로 가공 output -> writer
			// BufferedWriter로 가공
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

			// 클라이언트에게 메시지 보내기
			bw.write("서버와 접속 되었습니다.\n");
			bw.write("안녕 클라이언트!\n");
			
			bw.flush();
			
			String msg = br.readLine(); // '\n'이 있는 곳까지 읽음

			System.out.println("클라이언트에게 받은 메시지: " + msg);
			
			System.out.println("서버 종료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {br.close();}	//reader 닫기
				if(bw != null) {bw.close();}	//writer 닫기
				if(socket != null) {socket.close();}	//socket 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
