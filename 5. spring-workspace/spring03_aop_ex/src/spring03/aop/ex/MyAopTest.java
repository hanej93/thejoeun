package spring03.aop.ex;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex/springContext.xml")
public class MyAopTest {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void test() {
		PrintFiveDanOnePerSec fiveDan = ctx.getBean("fiveDan", PrintFiveDanOnePerSec.class);
		
		fiveDan.printFiveDan();
	}

}
