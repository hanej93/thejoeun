package day0322.listex02;

import java.util.LinkedList;

public class Ex01 {
	public static void main(String[] args) {
		
		// LinkedList (연결 리스트)
		// 같은 인터페이스를 쓰고 있기 때문에 같은 메소드를 활용할 수 있는 것이다.
		LinkedList<String> list = new LinkedList<String>();
		
		// 음식 리스트를 넣어보자!
		
		list.add("소곱창");
		list.add("오징어회");
		list.add("돈까스");
		System.out.println(list);
		list.add(2, "햄버거");
		System.out.println(list);
		list.set(3, "경양카츠");
		System.out.println(list);
		System.out.println("삭제된 데이터: " + list.remove(0));
		System.out.println(list);
		
		// 써보니 ArrayList 랑 사용방법이 똑같네!
		// 그럼 똑같은 거 아닌가??
		// 그럼 왜 두가지로 나눴을까?
		// 내부적으로 방식이 다르다!!
		
		// ArrayList가 데이터 접근이 훨씬 빠름
		// 참조, 조회를 많이 할 경우 ArrayList
		
		// LinkedList 추가 삭제가 유리하다!
		// 추가, 삭제 작업이 많이 일어날 경우
		
		
	}
}
