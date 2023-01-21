package day0408.dataIOEx01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		// 파일 생성
		String fileName = "Ex01Data";
		File file = new File("src/day0408/dataIOEx01", fileName);
		
		// 파일에 파일아웃풋을 연결하고, 버퍼아웃풋을 연결하고, 데이터아웃풋을 연결
		try(DataOutputStream dout = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)))){
			
			// 자료형을 써보자!
			byte b = 10;
			char c = '가';
			int i = 1000000;
			double d = 3.14;
			String s = "문자열 데이터";
			
			dout.write(b);
			dout.writeChar(c);
			dout.writeInt(i);
			dout.writeDouble(d);
//			dout.writeChars(s);
			dout.writeUTF(s);
			
			dout.flush();
			System.out.println("파일 작성 끝");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
