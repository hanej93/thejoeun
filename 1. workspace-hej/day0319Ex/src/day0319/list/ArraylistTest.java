package day0319.list;

import java.util.ArrayList;

public class ArraylistTest {
	public static void main(String[] args) {
		int[] intArr = new int[8];

		intArr[0] = 1;
		intArr[1] = 5;
		intArr[2] = 10;
		intArr[3] = 15;
		intArr[4] = 20;

		intArr[5] = 30;
		intArr[6] = 40;

		for (int i : intArr) {
			System.out.print(i + "  ");
		}

		for (int i = 7; i > 2; i--) {
			intArr[i] = intArr[i - 1];
		}
		intArr[2] = 100;

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i : intArr) {
			System.out.print(i + "  ");
		}

		intArr[4] = 2;

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i : intArr) {
			System.out.print(i + "  ");
		}

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("게임");
		arrList.add("영화");
		arrList.add("운동");

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(arrList);
		arrList.set(1, "공부");
		arrList.add(1, "코딩");
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		arrList.remove(1);
		for (int i = 1; i <= 2; i++) {
			System.out.print(arrList.get(i) + "  ");
		}
		
		

	}

}
