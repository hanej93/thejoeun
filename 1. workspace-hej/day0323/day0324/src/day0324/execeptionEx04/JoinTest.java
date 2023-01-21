package day0324.execeptionEx04;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		/*
		 * DuplicationIdException 예외 객체 생성!!
		 * 
		 * 사용자로부터 아이디와 비밀번호를 입력받는다. 
		 * 입력받은 아이디와 비밀번호는 Join객체의 join() 메서드를 이용하여 
		 * 데이터(id, password)를 추가한다.
		 * 이때 id가 이미 있다면! 사용자에 "중복된 아이디 입니다"라고 출력하고
		 * -> exception 발생!! catch 처리!
		 * 
		 * 다시 입력받도록 한다.
		 * 입력이 끝나면
		 * Join객체의 getUsers()라는 메서드로 가입된 사람의 정보를 Map으로 받는다.
		 * map을 이용하여 가입된 사람의 정보를 모두 출력!
		 */		
		
		Scanner sc = new Scanner(System.in);
		Join j = new Join();
		for (int i = 0; i < 5; i++) {
			System.out.println("아이디를 입력하세요>>");
			String id = sc.next();
			System.out.println("비밀번호를 입력하세요>>");
			String pw = sc.next();
			try {
				j.join(id,pw);
			} catch (DuplicationIdException e) {
				//e.printStackTrace();
				System.out.println("중복된 아이디입니다.");
				i--;
			}
		}
		
		for (Entry<String, String> entUser : j.getUserMap().entrySet()) {
			System.out.println("아이디: " + entUser.getKey());
			System.out.println("비밀번호: " + entUser.getValue());
			
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		
		
	}

}
