package day0406Ex.fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExTest01 {

	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("./src/day0406Ex/fileoutput/test.txt");
		
			for(char i = 97 ; i <97+26 ; i++) {
				fout.write(i);
			}
			
			System.out.println("알파벳 입력 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
