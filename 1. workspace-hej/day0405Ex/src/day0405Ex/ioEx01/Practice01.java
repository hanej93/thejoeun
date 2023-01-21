package day0405Ex.ioEx01;

import java.io.ByteArrayInputStream;

public class Practice01 {
	public static void main(String[] args) {
		byte[] inByteData = new byte[128];

		for (int i = 0; i < inByteData.length; i++) {
			inByteData[i] = (byte) i;
		}
		ByteArrayInputStream input = new ByteArrayInputStream(inByteData);

		int data = -1;
		while ((data = input.read()) != -1) {
			System.out.printf("%3d\n", data);
		}

	}
}
