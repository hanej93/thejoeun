package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class InsertTest {
	public static void main(String[] args) {
		UserDao dao = UserDaoImpl.getInstance();
		
		
		User user = new User(0, "사쿠라", "치료", 
				LocalDate.now(), "010-1111-1111", "나뭇잎마을", LocalDateTime.now());
		int row = dao.insert(user);
		System.out.println(row);
		
		
		
	}
}
