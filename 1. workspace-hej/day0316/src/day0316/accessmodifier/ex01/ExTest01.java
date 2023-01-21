package day0316.accessmodifier.ex01;

public class ExTest01 {
	public static void main(String[] args) {
		// Ex01과 같은 패키지이며, 다른 클래스
		
		Ex01 ex1 = new Ex01();
		
		ex1.publicStr ="퍼블릭";
		ex1.protectedStr = "프로텍티드";
		ex1.defaultStr = "디폴트";
		
		// 동일 클래스에서만 사용 가능하기 때문에 타 클래스에서 접근 불가
//		ex1.privateStr = "프라이빗"; 

	}
}
