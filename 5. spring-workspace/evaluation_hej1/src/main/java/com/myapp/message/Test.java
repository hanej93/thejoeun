package com.myapp.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {

	
	public static void main(String[] args) {
	
		
		
		System.out.println("실행확인");
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:/WEB-INF/spring/root_context.xml");
//		MessageMapper messageMapper = ctx.getBean(MessageMapper.class);
		MessageService messageService = ctx.getBean(MessageService.class);
		System.out.println("요건뭐야: " + messageService);

		
		
//		List<MessageDto> msgList = messageMapper.selectMsgList();
//		List<MessageDto> msgList = messageService.getMessageList();
//		for(MessageDto msg : msgList) {
//			System.out.println(msg);
//		}
		
//		messageService.deleteMessage(11, "고무고무");
		
	}

}
