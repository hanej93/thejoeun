package test;

import homework.user.User;
import homework.user.UserDao;
import homework.user.UserDaoImpl;

public class DeleteTest {
	public static void main(String[] args) {
		UserDao dao = UserDaoImpl.getInstance();
		
		User user = new User();
		user.setId(5);
		int result = dao.delete(user);
		
	}
}
