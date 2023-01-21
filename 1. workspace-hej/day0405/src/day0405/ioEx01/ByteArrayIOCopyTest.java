package day0405.ioEx01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIOCopyTest {
	public static void main(String[] args) {
		byte[] ori = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] copy;

		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		byte[] bagagi = new byte[10];

		// 읽어서 bagagi에 저장
		in.read(bagagi, 0, 10);
		System.out.println("bagagi>>");
		System.out.println(Arrays.toString(bagagi));

		out.write(bagagi, 0, 10);

		System.out.println();
		System.out.println();

		copy = out.toByteArray();
		System.out.println("copy>>");
		System.out.println(Arrays.toString(copy));

	}
}
