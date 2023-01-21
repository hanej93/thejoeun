package mySpring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest {
	
	public static void main(String[] args) {
		
		
		// 스프링 컨테이터 객체를 만들어줌
		ApplicationContext ctx =
				new GenericXmlApplicationContext("mySpring/ex01/springContext.xml");
		
		System.out.println("스프링 컨텍스트 객체 생성");
		System.out.println(ctx);
		
		// 스프링 컨테이너에 들어있는 빈을 꺼내보자
		MySpringBean msb = (MySpringBean)ctx.getBean("mySpringBean");
		msb.setStr1("가렌");
		msb.setStr2("럭스");
//		msb.setNum1(10);
		System.out.println(msb);
		
		MySpringBean msb2 = (MySpringBean)ctx.getBean("mySpringBean");
		System.out.println(msb2);
		
		MySpringBean02 msb02 = (MySpringBean02)ctx.getBean("mySpringBean02");
		System.out.println(msb02);
		
		
		MySpringBean03 msb03 = ctx.getBean("mySpringBean03", MySpringBean03.class);
		System.out.println(msb03);
		
	}
}
