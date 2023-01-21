package spring03.aop.ssy;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ssy/springContext.xml")
// = new GenericApplicationContext("spring03/aop/ex/springContext.xml");
public class GugudanTest {
	@Autowired
	ApplicationContext ctx;
	
	
	
	@Test
	public void test() {
		Gugudan gugudan = ctx.getBean("gugudan",Gugudan.class);
		gugudan.gugudanPrint();
	}
}
