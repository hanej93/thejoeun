package mySpring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RobotTest {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("mySpring/ex04/springContext.xml");
		
		
		Transformer tf = ctx.getBean("transformer", Transformer.class);
		TaekwonV tv = ctx.getBean("taekwonV", TaekwonV.class);
		
		tf.setName("트랜스포머");
		System.out.print(tf.getName() + "의 ");
		tf.getAttack().attack();
		
		tv.getAttack().attack();
		
		Gundam gundam = ctx.getBean("gundaaaaaaaaaaaaaam", Gundam.class);
		gundam.fight();
	}
}
