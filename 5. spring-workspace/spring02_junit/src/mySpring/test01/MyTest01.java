package mySpring.test01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mySpring.test02.User;


@RunWith(SpringJUnit4ClassRunner.class)

// ApplicationContext ctx = 
//new GenericXMLApplicationContext("mySpring/test02/springContext.xml");
// 아래와 동일
@ContextConfiguration(locations = "classpath:mySpring/test02/springContext.xml")
public class MyTest01 {
// 단위테스트 도구!
// 단위별 기능을 테스트하기 위한 클래스
// DAO의 select()를 만들었다면 이 아이만 테스트하기 위해 사용	
	
	
	@Autowired
	User user;
	
	// 메서드에 Test어노테이션을 붙여서 실행한다.
	@Test
	public void test() {
		
		assertNotNull(user);
		assertNotNull(user.getPhone());
	}

	@After
	public void testAfter() {
		System.out.println(user.getPhone().getBrand());
	}

	/*
	 * 
	 *  junit의 어노테이션
	 *  @Test : 테스트 하고자 하는 메서드에 선언
	 *  @After : @Test 어노테이션이 실행되고 실행되는 메서드
	 *  @Before : @Test 가 실행되기 전에 실행되는 메서드
	 *  
	 *  @AfterClass : 모든 테스트가 실행되고 나서 딱 한번 실행되는 아이
	 *  @BeforClass : 딱 한번 모든 테스트 전에 실행되는 아이
	 *  
	 *  spring-test
	 *  @RunWith(SpringJUnit4ClassRunner.class)
	 *  @ContextConfiguration(location="스프링설정파일")
	 */ 

}
