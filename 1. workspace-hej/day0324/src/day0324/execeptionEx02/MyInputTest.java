package day0324.execeptionEx02;

import java.io.IOException;

public class MyInputTest {

	public static void main(String[] args) {
		MyInput mi = new MyInput();
		System.out.println("문자를 입력하시오.");
		String str = mi.readString();
		System.out.println("읽어들인 값: " + str);
		
		System.out.println();
		System.out.println();
		System.out.println();

		MyInputThrows mit = new MyInputThrows();
		System.out.println("문자를 입력하시오.");
		String str1 = null;
		try {
			str1 = mit.readString();
		} catch (IOException e) {
			System.out.println("입력받은게 뭔가 잘못되었어!!");
		}
		System.out.println("읽어들인 값: " + str1);
		
	}

}
