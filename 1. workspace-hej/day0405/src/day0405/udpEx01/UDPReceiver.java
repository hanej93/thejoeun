package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
	public static void main(String[] args) {
		// UDP 받기

		try {
			// datagram socket을 포트번호를 넣어 만듦
			DatagramSocket socket = new DatagramSocket(7777);

			while (true) {
				// 수신데이터를 저장할 빈 배열 준비
				byte[] buf = new byte[1024];

				// 수신할 데이터가 저장될 빈 패킷도 준비!
				DatagramPacket packet = new DatagramPacket(buf, buf.length);

				// 소켓을 통해서 수신
//				System.out.println("데이터 수신 대기중........");

				socket.receive(packet);

				// 데이터를 열어보자.
				System.out.println("받은 데이터: " + new String(buf).trim());
			}
//			System.out.println("수신 끝!");

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
