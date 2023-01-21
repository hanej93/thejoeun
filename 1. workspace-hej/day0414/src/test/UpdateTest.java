package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class UpdateTest {
	public static void main(String[] args) {
		UserDao dao = UserDaoImpl.getInstance();
		
		User user = new User(4, "나미", "도둑고양이", LocalDate.parse("1997-07-03")
				, "010-4444-4444", "이스트 블루 오이코트 왕국", LocalDateTime.parse("2021-04-14T11:11:11"));		
		
		dao.update(user);
		
		int row = dao.update(user);
		
		User searchUser = new User();
		searchUser.setUserId("나미");
		System.out.println(dao.selectWithUserId(searchUser));
		
	}
}
