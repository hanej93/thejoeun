package day0406.fileEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {
	public static void main(String[] args) {

		// �о�� ��� ���ϰ�ü �Ǵ� �ּ�(���)
		File file = new File("src/day0406/fileEx01/inputTestEx.txt");

		// FileInputStream��ü�� ���Ͽ� �����Ͽ� ����
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(file);
			// FileInputStream��ü�� ���Ͽ��� read()�Ѵ�.

			// ������ �̷��� �д´�.
//			int c = fin.read();
//			System.out.println(c);
//			System.out.println((char)c);

			while (fin.available() > 0) {
				int c = fin.read();
				System.out.print((char) c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
