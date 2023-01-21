package test;

import java.util.List;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class SelectListTest {
	public static void main(String[] args) {
		UserDao dao = UserDaoImpl.getInstance();
		
		List<User> userList =dao.selectList();
		
		System.out.println(userList);
	}
}
