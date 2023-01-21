package day0322.setex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {

		// 음식 5가지를 담을 수 있는 set을 만들고 하나씩 출력해보시오
		// 이때 Iterator를 사용하는 방법 하나
		// for 문을 사용하는 방법 하나

		Set<String> foods = new HashSet<>();

		foods.add("떡볶이");
		foods.add("물회");
		foods.add("짬뽕");
		foods.add("칼국수");
		foods.add("제육덮밥");

		Iterator<String> itFood = foods.iterator();
		while (itFood.hasNext()) {
			System.out.println("음식: " + itFood.next());
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (String string : foods) {
			System.out.println(string + "\t");
		}

		foods.remove("칼국수");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("칼국수 삭제 >>>>");

		System.out.println(foods);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("랜덤 배열 생성>>>>>");
		Set<Integer> numbers = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			numbers.add((int) (Math.random() * 100) + 1);
		}

		Iterator<Integer> randomNum = numbers.iterator();
		while (randomNum.hasNext()) {
			System.out.println(randomNum.next() + "\t");
		}

		System.out.println();
		System.out.println("2배 후 >>>>>>");

		int setTotal = 0;
		Iterator<Integer> twiceNum = numbers.iterator();
		while (twiceNum.hasNext()) {
			int twiceElement = twiceNum.next() * 2;
			setTotal += twiceElement;
			System.out.println(twiceElement + "\t");
		}

		System.out.println();
		System.out.println("2배 후 총합: " + setTotal);

		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		// TreeSet 예시!!!!
		
		Set<Integer> numberSet = new TreeSet<Integer>();
		
		numberSet.add(10);
		numberSet.add(15);
		numberSet.add(7);
		numberSet.add(1);
		numberSet.add(30);
		numberSet.add(20);
		
		System.out.println(numberSet);
		int tot = 0;
		for (Integer integer : numberSet) {
			System.out.println(integer+" ");
			tot+= (integer*2);
		}
		System.out.println("총합: " + tot);
		
		
	}

}
