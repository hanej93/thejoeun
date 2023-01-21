package spring04_mybatis;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04_mybatis/springContext.xml")
public class JDBCTest {

	
	// SqlSession을 통해 객체를 가져옴(인터페이스) -> 스프링으로 미리 등록을 해놨음(sqlSessionTemplate)
	@Autowired
	SqlSession sqlSession; 
	
	@Test @Ignore
	public void test() {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("spring04_mybatis/springContext.xml");
		
		// assertNotNull(ctx);
		DataSource ds = ctx.getBean(DataSource.class);
		assertNotNull(ds);
		
		SqlSessionFactoryBean ssfb = ctx.getBean(SqlSessionFactoryBean.class);
		assertNotNull(ssfb);
		
		SqlSessionTemplate sqlSession= ctx.getBean(SqlSessionTemplate.class);
		
		assertNotNull(sqlSession);
		
	}

	@Test @Ignore
	public void insertTest() {
		
		Person person = new Person(0, "하이머딩거", 50);
		
		// sqlSession.update("네임스페이스.사용할쿼리가있는태그의아이디", 파라미터);
		int affectedRows = sqlSession.update("personSession.insertPerson", person);
		System.out.println("적용된 row: " + affectedRows);
	}
	
	@Test @Ignore
	public void selectTest(){
		List<Person> personList = sqlSession.selectList("personSession.selectPersonList");
		for(Person person : personList) {
			System.out.println(person);
		}
	}
	
	@Test
	@Ignore
	public void deleteTest() {
		int affectedRows = sqlSession.delete("personSession.deletePerson", "카타리나");
		System.out.println("적용된 row: " + affectedRows);
	}
	
	@Test @Ignore
	public void selectOneTest() {
		Person person = sqlSession.selectOne("personSession.selectPersonById", 2);
		System.out.println(person);
	}
	
	@Test
	public void updateTest() {
		Person person = new Person(2, "하이머딩거", 20);
		int affectedRows = sqlSession.update("updatePerson", person);
		System.out.println("수정된 rows: " + affectedRows);
	}
	
}
