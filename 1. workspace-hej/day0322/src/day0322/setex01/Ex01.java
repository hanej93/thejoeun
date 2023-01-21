package day0322.setex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// 중복이 없다. 특정 아이를 꺼낼 수 없다.
		Set<Integer> myNumber = new HashSet<>();
		myNumber.add(10);
		myNumber.add(45);
		myNumber.add(20);
		myNumber.add(30);
		myNumber.add(11);
		myNumber.add(3);

		// 순서대로 저장되지 않음 -> get() 이라는 메소드를 가지고 있지 않음
		System.out.println(myNumber);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Iterator<Integer> it = myNumber.iterator();
		while (it.hasNext()) {
			System.out.println("숫자: " + it.next());
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// for문으로도 가능
		for (Integer i : myNumber) {
			System.out.println("i: " + i);
		}

		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 같은 번호를 추가해도 추가되지 않는다.
		myNumber.add(10);
		
		System.out.println(myNumber);
		
	}
}
