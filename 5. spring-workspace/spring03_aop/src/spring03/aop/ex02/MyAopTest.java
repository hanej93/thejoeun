package spring03.aop.ex02;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex02/springContext.xml")
public class MyAopTest {

	@Autowired
	ApplicationContext ctx;
	
	@Ignore
	@Test
	public void test() {
		Boy boy = ctx.getBean("boy", Boy.class);
		Girl girl = ctx.getBean("girl", Girl.class);
		
		System.out.println(boy.doSomething());
		System.out.println(girl.doSomething());
	}
	
	
	@Test
	public void testRobot() {
		Robot robot = ctx.getBean("robot", Robot.class);
		System.out.println(robot.fight());
	}

}
