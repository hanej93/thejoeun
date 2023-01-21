package spring.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RobotTest {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("spring/ex02/springContext.xml");
		
		TaekwonV tv = ctx.getBean("taekwonV", TaekwonV.class);
		Transformer tf = ctx.getBean("transformer", Transformer.class);
		
		tv.getAttack().attack();
		tf.getAttack().attack();		
	}
}
