package day0319.listEx01;

import java.util.*;

public class ListTest01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("****** list 객체생성 ******");
		System.out.println("list의 크기: " + list.size());
		
		list.add("milk"); // milk 추가
		System.out.println();
		System.out.println("****** list에 milk 추가 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);   //ArrayList클래스가 toString메소드 오버라이드
		
		list.add("bread"); // bread 추가
		System.out.println();
		System.out.println("****** list에 bread 추가 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);
		
		list.add("butter"); // butter 추가
		System.out.println();
		System.out.println("****** list에 butter 추가 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);
		
		list.add(1, "apple");   // index 1번에 apple 추가
		System.out.println();
		System.out.println("****** list에 index 1번에 apple 추가 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);
		
		list.set(2, "grape");  //index 2번에 grape로 변경
		System.out.println();
		System.out.println("****** list에 index 2번에 grape 추가 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);
		
		list.remove(3);  // index 3번을 제거
		System.out.println();
		System.out.println("****** list에 index 3번을 제거 ******");
		System.out.println("list의 크기: " + list.size());
		System.out.println(list);
		
		
		// 사용하기위해 꺼내기!
		System.out.println();
		System.out.println("****** index 0번에 있는 값을 출력하시오 ******");
		System.out.println("index 0번: " + list.get(0));
		System.out.println(list);
		
		System.out.println();
		System.out.println("****** index 2번에 있는 값을 출력하시오 ******");
		System.out.println("index 2번: " + list.get(2));
		System.out.println(list);
		
		
	}
}
