package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPSender {
	public static void main(String[] args) {
		try {
			// 목적지를 자신한테 보낼꺼!
			InetAddress ip = InetAddress.getByName("192.168.1.51");

			// udp 는 datagram socket 을 이용하여 보낸다.
			DatagramSocket socket = new DatagramSocket();
			Scanner sc = new Scanner(System.in);

			while (true) {

				// 보낼 데이터를 바이트 배열로 준비
				String msg = sc.nextLine();
				if(msg.equals("끝")) {
					break;
				}

				// 문자열 getBytes()로 이용하여 바이트 배열로 반환 받는다.
				// 자신이 가지고 있는 문자열을 바이트배열로 반환해라!
				byte[] buf = msg.getBytes();

				// 준비된 데이터 쏴!
				// 목적지의 "포트", "아이피 주소", "데이터"
				// 데이터를 datagram packet 으로 묶어 보낸다.
				// (보낼 데이터의 바이트 배열, 길이, 아이피주소, 포트번호)
				DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 7777);

				// 소켓을 통해 데이터를 전송한다.
				socket.send(packet);
				
			}
			System.out.println("데이터 전송 끝!!");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
