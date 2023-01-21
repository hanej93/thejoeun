package day0405Ex.ioEx02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class practice01 {
	public static void main(String[] args) {
		byte[] ori = new byte[10];

		for (int i = 0; i < ori.length; i++) {
			ori[i] = (byte) (ori.length - i);
		}

		byte[] bagagi = new byte[3];

		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

//		for (int i = 0; i <= ori.length / bagagi.length; i++) {
//			out.write(bagagi, 0, in.read(bagagi, 0, bagagi.length));
//		}
		
		// 실수!!
//		in.read(bagagi, 0, ori.length % bagagi.length);
//		out.write(bagagi, 0, ori.length % bagagi.length);
		
		while(in.available() > 0) {
			out.write(bagagi, 0, in.read(bagagi, 0, bagagi.length));
		}
		
		
		byte[] copy;
		copy = out.toByteArray();
		System.out.println("복사본>>");
		System.out.println(Arrays.toString(copy));
	}
}
