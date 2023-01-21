package day0408.readerwriterEx02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		
		File file = new File("src/day0408/readerwriterEx02","test.txt");
		
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter(file))){
			
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					bw.write(j +" x " + i + " = " +(j*i)+"\t\t");
				}
				bw.newLine(); // 파일에 개행처리함
			}
			
			bw.flush();
			System.out.println("파일 작성 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
