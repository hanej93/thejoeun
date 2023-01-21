package day0407Ex.bufferedEx01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx01 {
	public static void main(String[] args) {

		File file = new File("src/day0407Ex/bufferedEx01/BufferedOutputStreamEx01.txt");
		try (FileOutputStream fout = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(fout)){
				
			for (int i = 0; i < 1024; i++) {
				bout.write(i);
			}
			System.out.println("파일 작성 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
