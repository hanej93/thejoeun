package day0322.mapEx01;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UserMapTest {
	public static void main(String[] args) {
		// key가 이름인 맵을 만들어보자!!
		//value는 user를 담는
		
		Map<String , User> userMap = new HashMap<String, User>();
		User user1 = new User("여자라서 햄볶아요", "1234");
		User user2 = new User("바람과 함께 살빠지다", "2222");
		User user3 = new User("부릅뜨니 숲이었어", "3333");
		
		userMap.put("루피", user1);
		userMap.put("상디", user2);
		userMap.put("쵸파", user3);
		
		// 상디의 비밀번호는?
		
		System.out.println("상디의 비밀번호는? "+userMap.get("상디").getPassword());
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		// 쵸파의 아이디는?
		
		System.out.println("쵸파의 아이디는? "+userMap.get("쵸파").getUserId());
		System.out.println();
		System.out.println();
		System.out.println();
		// 맴에 들어있는 객체의 모든 아이디를 출력하시오!
		
		
		System.out.println("keySet 사용>>>");
		Collection<User> users = userMap.values();
		
		for (User user : users) {
			System.out.println("아이디: " + user.getUserId());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Entry 사용>>>");
		for(Entry<String, User> entUser : userMap.entrySet()) {
			System.out.println("이름: " +entUser.getKey() + " , 아이디: " + entUser.getValue().getUserId() 
					+ " , 비밀번호: " + entUser.getValue().getPassword());
		}
		
	}
}
