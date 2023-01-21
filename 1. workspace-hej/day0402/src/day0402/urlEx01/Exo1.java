package day0402.urlEx01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exo1 {

	public static void main(String[] args) {
		// ip나 host를 관리하는 클래스
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
