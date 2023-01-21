package day0324Ex.exceptionpractice2;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요~");
		int num = sc.nextInt();
		String str = "숫자3은 안됩니다!";
		
		if(num == 3) {
			try {
				throw new MyException(str);
			} catch (MyException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
