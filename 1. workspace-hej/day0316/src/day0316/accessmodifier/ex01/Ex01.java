package day0316.accessmodifier.ex01;

public class Ex01 {
	// 접근지정자(access modifier)
	// 클래스간(필드, 메소드) 에 접근을 허용할 범위를 지정하는 것
	// 필드 또는 메소드에게 지정할 수 있다.

	// 필드 == 속성
	// 클래스 바로 안에 선언하는 변수
//	static String name; // 클래스 변수 -> 객체생성 x 사용 가능
//	int age;			// 인스턴스 변수 -> 객체를 생성해야 사용 가능

	public String publicStr;
	protected String protectedStr;
	String defaultStr;
	private String privateStr; // 동일 클래스 안에서만 접근이 가능하다!

	// 메서드
	public void getInfo() {

		System.out.println("publicSstr: " + publicStr);
		System.out.println("protectedStr: " + protectedStr);
		System.out.println("defaultStr: " + defaultStr);
		System.out.println("privateStr: " + privateStr);

	}

}
