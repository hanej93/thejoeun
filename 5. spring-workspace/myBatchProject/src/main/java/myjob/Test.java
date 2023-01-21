package myjob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("config/myScheduler.xml");
	}

}
