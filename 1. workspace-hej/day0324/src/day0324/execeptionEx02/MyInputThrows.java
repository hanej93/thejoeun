package day0324.execeptionEx02;

import java.io.IOException;

public class MyInputThrows {
	
	// 사용자로부터 입력받은 값을 문자열로 반환해주는 메소드
	public String readString() throws IOException {
		byte[] buf = new byte[100];

		// 콘솔에서 문자를 읽어 buf에 넣을거임
		System.in.read(buf);

		return new String(buf);

	}
}
