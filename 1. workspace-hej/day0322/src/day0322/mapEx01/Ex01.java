package day0322.mapEx01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// 맵은 key와 value로 이루어짐
		// 짝꿍!!!!

		Map<Integer, String> map = new HashMap<Integer, String>();

		// 넣는 메서드 put()
		map.put(5, "돌돔");
		map.put(6, "감성돔");
		map.put(7, "참돔");
		map.put(8, "벵어돔");

		// 값을 키로 가져온다!!
		System.out.println(map.get(5));
		System.out.println(map.get(7));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("짜장면", "검정");
		map2.put("짬뽕", "빨간");
		map2.put("탕수육", "누런");

		System.out.println(map2.get("짜장면"));
		System.out.println(map2.get("짬뽕"));
		System.out.println(map2.get("탕수육"));
		
		System.out.println();
		System.out.println(map2);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 맵 안에 있는 값을 뽑아 "색"이라는 글자를 붙여 출력하자!!
		
		// Entry - .entrySet 방식
		for (Entry<String, String> e : map2.entrySet()) {
			System.out.println("Key: " + e.getKey() +" , Value: " + e.getValue() +"색");
		}
		
		
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		
		System.out.println("keySet 출력"); 
		Set<String> keySet = map2.keySet(); // key를 set으로 묶어서 반환(중복이 안되기 때문에 Set!!)
		
		for (String k : keySet) {
			System.out.println(k + "\t");
		}
		
		map2.values(); // value를 반환 Collection형태로 가져옴(중복이 가능하기 때문!)
		
	}

}
