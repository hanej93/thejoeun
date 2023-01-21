package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import user.User;
import user.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class Test {
	
	@Autowired
	UserMapper userMapper;
	
	@org.junit.Test
	public void test() {
		List<User> userList = userMapper.selectUserList();
		User user = userMapper.selectUserById(5);
		user.setPassword("악마의아이");
		userMapper.updateUser(user);
		
		List<User> userListByRange = userMapper.selectUserListByRange(2, 2);
		
		for (User u : userList) {
			System.out.println(u);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(user);

		System.out.println();
		System.out.println();
		System.out.println();

		
		for (User u : userListByRange) {
			System.out.println(u);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		userList = userMapper.selectUserByKeywordOfName("로");
		
		for (User u : userList) {
			System.out.println(u);
		}
		
	}

}
