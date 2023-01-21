package day0407Ex.bufferedEx01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOExTest {
	public static void main(String[] args) {
		File file = new File("src/day0407Ex/bufferedEx01/BufferedIOExTest.txt");

		try (FileOutputStream fout = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {

			for (int i = 1; i <= 100; i++) {
				bout.write(i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		try (FileInputStream fin = new FileInputStream(file);
				BufferedInputStream binput = new BufferedInputStream(fin)) {
			while (binput.available() > 0) {
				System.out.print((char) binput.read());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
