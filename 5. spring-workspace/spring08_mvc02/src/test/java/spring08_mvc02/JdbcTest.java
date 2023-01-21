package spring08_mvc02;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.user.User;
import com.myapp.user.UserMapper;
import com.myapp.user.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root_context.xml")
public class JdbcTest {

	@Autowired
	DataSource datasource;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UserService userService;
	
	@Test
	public void getUserListTest() {
		List<User> userList = userService.getUserList();
		for(User user : userList) {
			System.out.println(user);
		}
	}
	
	@Test @Ignore
	public void test() {
		assertNotNull(datasource);
		
		assertNotNull(userMapper);
	}
	
	@Test @Ignore
	public void selectUserTest() {
		List<User> userList = userMapper.selectUsers();
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	
	
	
	

}
