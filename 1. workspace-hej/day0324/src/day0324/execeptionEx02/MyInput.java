package day0324.execeptionEx02;

import java.io.IOException;

public class MyInput {
	
	// 사용자로부터 입력받은 값을 문자열로 반환해주는 메소드
	public String readString() {
		byte[] buf = new byte[100];
		
		// 콘솔에서 문자를 읽어 buf에 넣을거임
		try {
			System.in.read(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new String(buf);
		
	}
}
