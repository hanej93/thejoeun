package day0324.execeptionEx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// 파일에서 글자를 읽어오는 아이!
		// IOException 은 checked Exception 이다.
		// try - catch 문이 항상 필요!
		// 컴파일시 체크해준다!
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없음!");
		} finally {
			// 리소스를 닫는다.
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("코드 종료~");
		
		
	}
}
