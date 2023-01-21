package day0406Ex.fileEx01.inputStreamEx01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx01Test {
	public static void main(String[] args) {
		File file = new File("src/FileInputStreamEx01Test.txt");

		try (FileInputStream fin = new FileInputStream(file)) {
			InputStreamReader reader = new InputStreamReader(fin, "MS949");
			BufferedReader in = new BufferedReader(reader);
			
			int i;
			while ((i = in.read()) != -1) {
				System.out.print((char)i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
