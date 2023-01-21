package day0408.readerwriterEx02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("src/day0408/readerwriterEx02","test.txt");
		
		try(BufferedReader br = new BufferedReader(
				new FileReader(file))){
			
			// br.readLine(); // (한 줄 읽기)개행이 있을 때까지 읽어준다.

			String s = null;
			while( (s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
