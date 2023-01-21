package day0407.bufferedEx02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx01 {
	public static void main(String[] args) {
		// 파일 복사
		// 원하는 파일을 읽고 그걸 새파일에 쓰면 됨

		try (BufferedInputStream binput = new BufferedInputStream(
				new FileInputStream(new File("image/night-view-6061251_1920.jpg")));
				BufferedOutputStream bout = new BufferedOutputStream(
						new FileOutputStream("src/day0407/bufferedEx02/copy.jpg"))) {

			while (binput.available() > 0) {
				bout.write(binput.read());
			}
			bout.flush();
			System.out.println("파일 복사 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
