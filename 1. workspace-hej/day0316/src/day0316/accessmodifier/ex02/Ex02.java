package day0316.accessmodifier.ex02;

import day0316.accessmodifier.ex01.Ex01;

public class Ex02 extends Ex01{
	
	public void getInfo() {
		publicStr = "hi";
		protectedStr = "hi";
//		defaultStr = "hi"; // 상속받은 default 는 다른 패키지여도 접근이 가능하다.
//		privateStr = "hi";
		
		System.out.println("publicSstr: " + publicStr);
		System.out.println("protectedStr: " + protectedStr);
//		System.out.println("defaultStr: " + defaultStr);
//		System.out.println("privateStr: " + privateStr);

	}
}
