package spring_di_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("spring_di_ex/springContext.xml");
		
		Student stu = (Student)ctx.getBean("student");
		
		
		System.out.println(stu);
		
		
	}

}
