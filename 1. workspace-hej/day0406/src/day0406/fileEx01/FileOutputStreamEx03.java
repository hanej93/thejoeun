package day0406.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamEx03 {
	public static void main(String[] args) {
		// 어? 그러면 작성하는건 무조건 byte 단위인건가?
		// 그러면 한글은?
		File file = new File("src/day0406/fileEx01/ex03.txt");
		
		try(FileOutputStream fout = new FileOutputStream(file)){
			
			// 한 번 쓸때 byte 단위가 넘어가면 byte가 짤리게 된다.
//			fout.write(65);  //A
//			fout.write(321); //A
			
			String str = "안";
			byte[] strByteArr = str.getBytes();
			System.out.println(strByteArr.length);
			System.out.println(Arrays.toString(strByteArr));
			fout.write(strByteArr);
			
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
