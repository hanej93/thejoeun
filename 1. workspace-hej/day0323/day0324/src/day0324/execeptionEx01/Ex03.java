package day0324.execeptionEx01;

public class Ex03 {
	public static void main(String[] args) {
		// try - catch

//		try {
//			예외가 발생할  수 있는 코드
//		} catch (처리할 예외의 타입) {
//			예외가 발생했을 때 실행할 코드
//		}

		int x = 1;
		int y = 0;
		int z;
		try {
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			z = -1;
		}
		System.out.println("x / y = " + z);

	}
}
