package day0319.list2;

public class ListArray {
	public static void main(String[] args) {
		int[] numbers = new int[8];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
		// numbers의 index 5번에 30을 삽입하시오.
		numbers[5] = 30;
		// numbers의 index 6번에 40을 삽입하시오.
		numbers[6] = 40;

		System.out.println("numbers 배열의 내용");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("**");

		// numbers 값 : 5, 값 : 10 사이에 100을 추가하시오.
		for (int j = 6; j >= 1; j--) {
			numbers[j + 1] = numbers[j];
		}
		numbers[1] = 100;
		System.out.println("numbers 배열의 내용");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("**");

		// numbers에서 index 4번을 2로 변경하시오.
		numbers[4] = 2;
		System.out.println("numbers 배열의 내용");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("**");

	}
}