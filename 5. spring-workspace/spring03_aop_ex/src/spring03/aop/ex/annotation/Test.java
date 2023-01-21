package spring03.aop.ex.annotation;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex/annotation/springContext.xml")
public class Test {

	@Autowired
	ApplicationContext ctx;
	
	@org.junit.Test
	public void test() {
		
		PrintFiveDanOnePerSec gugu = ctx.getBean(PrintFiveDanOnePerSec.class);
		gugu.printFiveDan();
	}
}
