package spring04_mybatis_ex;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04_mybatis_ex/springContext.xml")
public class JDBCTest {

	/*
	 * 1. 전체조회
	 * 
	 * 2. 아이디로 하나조회
	 * 
	 * 3. 삽입, 수정, 삭제
	 * 
	 * 4. 특정값이 아이디에 포함되어있는 아이 조회
	 */
	@Autowired
	ApplicationContext ctx;

	@Test
	@Ignore
	public void test() {
		DriverManagerDataSource dmds = ctx.getBean(DriverManagerDataSource.class);
		assertNotNull(dmds);
		SqlSessionFactoryBean ssfb = ctx.getBean(SqlSessionFactoryBean.class);
		assertNotNull(ssfb);
	}

	@Test
	@Ignore
	public void selectTest() {
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);
		List<User> userList = ss.selectList("userSession.selectUserList");

		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	@Ignore
	public void selectOneByIdTest() {
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);
		User user = ss.selectOne("userSession.selectUserById", 2);
		System.out.println(user);
	}

	@Test @Ignore
	public void insertTest() {
//		User user = new User(0, "우솝", "갓(GOD)",LocalDate.parse("1999-04-01"), "010-3333-3333", "이스트 블루 시롭 마을",
//				LocalDateTime.now());
		User user = new User(0, "니코 로빈", "악마의 아이",LocalDate.parse("1993-02-06"), "010-3333-3333", "웨스트 블루 오하라",
				LocalDateTime.now());
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);

		int affectedRows = ss.insert("userSession.insertUser", user);
		if (affectedRows != 0) {
			System.out.println("성공! " + affectedRows + "개의 쿼리가 영향을 받았습니다.");
		}
	}
	
	@Test @Ignore
	public void updateAfterSelectByIdTest() {
		
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);
		
		User user = ss.selectOne("userSession.selectUserById", 5);
		user.setPassword("갓");
		
		int affectedRows = ss.update("userSession.updateUser", user);
		if (affectedRows != 0) {
			System.out.println("수정성공! " + affectedRows + "개의 쿼리가 영향을 받았습니다.");
		}
	}
	
	@Test @Ignore
	public void deleteTest() {
		
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);
		
		int affectedRows = ss.delete("deleteUser", 5);
		if (affectedRows != 0) {
			System.out.println("삭제성공! " + affectedRows + "개의 쿼리가 영향을 받았습니다.");
		}
	}
	
	@Test
	public void selectByUserIdSearchingKewordTest() {
		
		SqlSession ss = ctx.getBean(SqlSessionTemplate.class);
		
		List<User> userList = ss.selectList("userSession.selectByUserIdSearchingKeword" ,"로");
		
		for(User user : userList) {
			System.out.println(user);
		}
	}

}
