package spring03.aop.ex03.annotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex03/annotation/springContext.xml")
public class AspectTest {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void test() {
		Boy boy = ctx.getBean(Boy.class);
		Girl girl = ctx.getBean(Girl.class);
		
		boy.doSomething();
		System.out.println("-------------------");
		girl.doSomething();
	}

}
