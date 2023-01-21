package com.myapp.test;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.guestbook.MessageDto;
import com.myapp.guestbook.MessageService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/WEB-INF/spring/root-context.xml")
public class MyTest {

	@Autowired
	MessageService messageService;

	
	@Test
	public void deleteTest() {
		
		messageService.deleteMessage(7,"요요");
	}

}
