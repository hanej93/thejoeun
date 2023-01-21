package day0407Homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyGugu {
	private File file = new File("gugu.txt");

	public void makeGuguFile() {

		try (FileOutputStream fout = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {
			for (int i = '1'; i <= '9'; i++) {
				for (int j = '2'; j <= '9'; j++) {

					bout.write(j);
					bout.write(' ');
					bout.write('x');
					bout.write(' ');
					bout.write(i);
					bout.write(' ');
					bout.write('=');
					bout.write(' ');

					int mul = (i - '0') * (j - '0');
					String str = Integer.toString(mul);
					for (int k = 0; k < str.length(); k++) {
						bout.write(str.charAt(k));
					}

					bout.write('\t');
					bout.write('\t');
				}
				bout.write('\n');
			}
			System.out.println("복사완료");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readGuguFile() {
		try (FileInputStream fin = new FileInputStream(file); BufferedInputStream bin = new BufferedInputStream(fin)) {

//			while (bin.available() > 0) {
//				System.out.print((char) bin.read());
//			}
			
			byte[] strArray = bin.readAllBytes();
			String str = new String(strArray);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
