package mySpring.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FoodTest {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("mySpring/ex02/springContext.xml");
		
		FavoriteFoods ff = ctx.getBean("foods", FavoriteFoods.class);
		
		System.out.println(ff.getFoods());
		
		User user = ctx.getBean("user", User.class);
		System.out.println("이름: " + user.getName());
		System.out.println("나이: " + user.getAge());
		System.out.println("좋아하는 음식: " + user.getFavoriteFoods().getFoods());
	}
}
