package day0322.listex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("주술회전");
		list.add("귀멸의칼날");
		list.add("살인교실");
		System.out.println(list);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		String[] foods = new String[5];
		foods[0] = "육회";
		foods[1] = "생간과 천엽";
		foods[2] = "삼겹살";
		foods[3] = "구복만두";
		foods[4] = "김밥";
		
		List foodsList = Arrays.asList(foods);
		
//		foodsList.add("순대국");
		System.out.println(foodsList);
		
		ArrayList<String> li = new ArrayList<String>(foodsList);
		li.add("순댓국");
		System.out.println(li);
		
	}
}
