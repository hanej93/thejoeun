package day0323.stringEx01;

public class Ex01 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "자동차";
		Car c1 = c;
		System.out.println("c.hashCode(): " + c.hashCode());
		System.out.println("c1.hashCode(): " + c1.hashCode());
		System.out.println("c.name: " + c.name);
		System.out.println("c1.name: " + c1.name);

		c1.name = "하이";
		System.out.println("c.name: " + c.name);
		System.out.println("c1.name: " + c1.name);
		
		
		System.out.println();
		System.out.println();

		// 기본 클래스들
		// 문자열 관련 클래스 : String
		// 불변객체다! immutable
		String str = "문자열";
		String str1 = "문자열";
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());

		String str2 = new String("문자열");

		System.out.println("str: " + str);
		str = "문자열1";
		System.out.println("str.hashCode(): " + str.hashCode());
		System.out.println("str1.hashCode(): " + str1.hashCode());
		System.out.println("str2.hashCode(): " + str2.hashCode());

		System.out.println("str: " + str);
		System.out.println("str1: " + str1);

		// 변수에 담기 주소를 비교함 두 주소가 같다
		System.out.println(str == str1); // true

		// 변수에 담긴 주소를 비교하기 때문에 다른 값이다.
		System.out.println(str1 == str2); // false

		String result = (str1 == str2) ? "참" : "거짓"; // 거짓
		String result1 = (str1.equals(str2)) ? "참" : "거짓"; // 참

		System.out.println(result);
		System.out.println(result1);

	}
}
