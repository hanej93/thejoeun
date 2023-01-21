package day0407.bufferedEx01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx01 {
	public static void main(String[] args) {
		// 버퍼: 바가지 같은 것
		// 버퍼링은 바가지에 데이터를 채우는 것
		// 기본(씽크) 입출력 스트림에 (처리)스트림을 연결해서 사용한다.

		File file = new File("src/day0407/bufferedEx01/BufferedOutputStreamEx01.txt");

		// 씽크스트림 변수 생성
		FileOutputStream fout = null;

		// 처리 스트림 변수 생성
		BufferedOutputStream bout = null;

		try {
			// 파일을 아웃풋 스트림에 연결
			fout = new FileOutputStream(file);

			// 아웃풋 스트림을 버퍼스트림에 연결
			bout = new BufferedOutputStream(fout);

			for (int i = 0; i < 1024*8; i++) {
				bout.write(i);
			}
			
			// 버퍼에 담긴 내용을 비우는 메서드
			// close를 하지않아도 작성됨
			bout.flush();
			
			System.out.println("파일 작성 끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bout != null) {
				try {
					// 버퍼를 비운 후 닫는다.
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
