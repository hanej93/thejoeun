package day0405.ioEx01;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteArrayInputStreamEx02 {
	public static void main(String[] args) {
		byte[] ori = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ByteArrayInputStream in = new ByteArrayInputStream(ori);

		// 배열만큼 읽도록 하기위한 배열 생성
		byte[] bagagi = new byte[10];

		in.read(bagagi, 0, 10); // 읽은 값의 길이를 반환하고 내용은 bagagi에 들어감
		
		System.out.println(Arrays.toString(bagagi));
		

	}
}
