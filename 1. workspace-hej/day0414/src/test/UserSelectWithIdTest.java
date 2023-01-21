package test;

import java.util.Scanner;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class UserSelectWithIdTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		UserDao dao = UserDaoImpl.getInstance();
		
		System.out.println("조회할 유저아이디를 입력하세요");
		String userId = sc.nextLine();
		User inputUser = new User();
		inputUser.setUserId(userId);
		User user = dao.selectWithUserId(inputUser);
		
		System.out.println(user);
	}
}
