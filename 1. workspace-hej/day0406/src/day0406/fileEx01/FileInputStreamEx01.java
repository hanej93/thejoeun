package day0406.fileEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {
	public static void main(String[] args) {

		// 읽어올 대상 파일객체 또는 주소(경로)
		File file = new File("src/day0406/fileEx01/inputTestEx.txt");

		// FileInputStream객체를 파일에 연결하여 생성
		FileInputStream fin = null;

		try {
			fin = new FileInputStream(file);
			// FileInputStream객체로 파일에서 read()한다.

			// 파일은 이렇게 읽는다.
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
