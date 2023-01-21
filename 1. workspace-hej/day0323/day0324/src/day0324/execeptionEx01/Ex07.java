package day0324.execeptionEx01;

public class Ex07 {
	public static void main(String[] args) {

		// 10개짜리 배열에 0~9까지의 수를 랜덤으로 넣고
		// 10을 배열의 값으로 나눈다
		int [] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]  =(int)(Math.random() * 10);
		}
		
		System.out.println();
		try {
			for (int i = 0; i < numbers.length + 1; i++) {
				System.out.println(10/numbers[i]);
			}

		} catch (IndexOutOfBoundsException ie) {
			System.out.println("인덱스 아웃 오브 바운즈 예외 발생!!");
		} catch (ArithmeticException ae) {
			System.out.println("\"0\"으로 나눠지는 로직이 발생");
		} catch (Exception e) {
			System.out.println("그 외 예외 발생!!");
		}
		System.out.println("프로그램 종료");

	}

}
