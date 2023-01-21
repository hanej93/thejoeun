package day0316.accessmodifier.ex02;

import day0316.accessmodifier.ex01.Ex01;

public class ExTest02 {
	public static void main(String[] args) {

		// 다른 패키지에 클래스가 있는 경우 어디있는지 알 수 없기에
		// 다른 패키지에 있는 것은 "import"를 사용해서 해당되는 패키지/클래스까지 알려줘야 함

		Ex01 ex2 = new Ex01();
		// 패키지의 경로를 적어줘서 import 없이 사용도 할 수 있다.
		// day0316.accessmodifier.ex01.Ex01 ex01 = new Ex01();
		
		
		ex2.publicStr ="퍼블릭";
		
		// 다른 패키지에서 접근 불가 상속을 받으면 가능(외부 패키지의 사용을 제한)
//		ex2.protectedStr = "프로텍티드";
		
		// 다른 패키지에서 접근 불가
//		ex2.defaultStr = "디폴트";
		
//		ex2.privateStr = "프라이빗"; 
		
	}
}
