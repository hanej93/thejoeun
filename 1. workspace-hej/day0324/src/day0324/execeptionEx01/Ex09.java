package day0324.execeptionEx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		
		
		// try - with -resource
		// 파일을 자동으로 닫아줌!!
		// close()를 자동으로 호출
		// (AutoCloseable 인터페이스를 구현한 애들) 만 자동으로 닫아준다.
		
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			
		} catch (FileNotFoundException e) {      // 파일을 찾을 수 없을 때
			e.printStackTrace();
			System.out.println("파일을 못 찾음");
		} catch (IOException e1) {    // 입출력 시 발생하는 예외
			e1.printStackTrace();
			System.out.println("입출력하다 문제가 발생");
		}
		
	}

}
