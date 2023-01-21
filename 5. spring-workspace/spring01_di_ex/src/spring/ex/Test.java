package spring.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("spring/ex/springContext.xml");
		
		Human human = ctx.getBean("human", Human.class);
		human.action();
		
		Cat cat = ctx.getBean("cat", Cat.class);
		cat.action();
		
		Alien alien = ctx.getBean("protoss", Alien.class);
		alien.action();
		
		
	}

}
