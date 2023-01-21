package day0406.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx02 {

	public static void main(String[] args) {
		// day0406.fileEx01 패키지 안에 문자 a~z까지 작성된 test.txt

		// 파일을 쓰기 위한 FileOutputStream 객체 필요
		// 파일주소 또는 파일객체도 필요

		// 파일객체를 생성
		// new File("파일 주소");
		File file = new File("src/day0406/fileEx01/test.txt");

		// 파일아웃풋 스트림에 파일을 연결하여 객체를 생성
		// try-resource 방식으로 만들면 자동으로 close해줌

		try (FileOutputStream fout = new FileOutputStream(file)) {

			// 파일에 데이터를 쓴다.
			// a-z 까지 쓴다
			for (char i = 'a'; i <= 'z'; i++) {
				fout.write(i);
			}
			System.out.println("작성 완료!");
			// 파일 아웃풋 스트림을 닫는다. -> 이미 try-resource 방식으로 이미 닫아지도록 처리됨

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
