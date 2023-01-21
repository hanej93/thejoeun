package com.myapp.aspect;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.message.MessageDto;
import com.myapp.message.MessageMapper;
import com.myapp.message.MessageService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/WEB-INF/spring/root_context.xml")
public class MyTest {

	@Autowired
	MessageService messageService;

	
	
	
	@Test @Ignore
	public void insertTest() {
		
		MessageDto msg = new MessageDto(0, "루피", "고무고무", "고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무",
				null, null);
		messageService.addMessage(msg);
	}
	
	@Test @Ignore
	public void selectTest() {
		
		List<MessageDto> msgList = messageService.getMessageList();
		System.out.println("셀렉트 테스트 실행되는중??");
		System.out.println(msgList);
		for(MessageDto msg : msgList) {
			System.out.println(msg);
		}
		
	}
	
	@Test @Ignore
	public void deleteTest() {
		messageService.deleteMessage(10,"고무고무");
		
		
		System.out.println("딜리트 확인");
		
	}
	
	@Test @Ignore
	public void updateTest() {
		
		MessageDto msg = new MessageDto(1, "루피", "고무고무", "고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무고무",
				null, null);
		
		boolean check = messageService.modifyMessage(msg);
		System.out.println("업데이트 확인: " + check);
		
	}

}
