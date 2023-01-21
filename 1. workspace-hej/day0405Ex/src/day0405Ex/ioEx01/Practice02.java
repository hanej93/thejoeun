package day0405Ex.ioEx01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Practice02 {

	public static void main(String[] args) {
		byte[] inByteData = new byte[128];
		byte[] result = null;

		for (int i = 0; i < inByteData.length; i++) {
			inByteData[i] = (byte) (inByteData.length - i - 1);
		}

		ByteArrayInputStream input = new ByteArrayInputStream(inByteData);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

//		int data = -1;
//		while ((data = input.read()) != -1) {
//			output.write(data);
//		}

		while (input.available() > 0) {
			output.write(input.read());
		}

		result = output.toByteArray();
		System.out.println(Arrays.toString(result));

	}

}
