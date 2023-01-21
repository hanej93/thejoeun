package spring03.aop.ex02.ex;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring03/aop/ex02/ex/springContext.xml")
public class GuguTest {
	
	
	@Autowired
	Gugu gugu;
	
	@Test
	public void test() {
		try {
			System.out.println(gugu.printGugu());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
