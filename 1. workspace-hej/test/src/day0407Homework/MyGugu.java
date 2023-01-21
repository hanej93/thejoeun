package day0407Homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyGugu {
	// 구구단을 파일로 만드는 코드가 있는 makeGuguFile()
	public static void makeGuguFile() {
		File file = new File("gugu.txt");
		try (FileOutputStream fout = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {

			for (int j = '1'; j <= '9'; j++) {
				for (int i = '2'; i <= '9'; i++) {
//					System.out.printf("%d *  %d  = %d\t\t", i, j, i*j);
					bout.write(i);
					bout.write(' ');		
					bout.write('*');  // 42 
					bout.write(' ');
					bout.write(j);
					bout.write(' ');
					bout.write('=');
					bout.write(' ');
					
					int multi = (i-48)*(j-48);
					String str = Integer.toString(multi);
					for (int k = 0; k < str.length(); k++) {
						bout.write(str.charAt(k));
					}
					
					bout.write('\t');
					bout.write('\t');
					
				}
				bout.write('\n');
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}