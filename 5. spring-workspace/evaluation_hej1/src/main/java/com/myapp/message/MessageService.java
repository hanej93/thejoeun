package com.myapp.message;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	@Autowired
	MessageMapper messageMapper;
	
	
	// getMessageList -> 방명록 내용을 모두 가져와 list로 반환
	public List<MessageDto> getMessageList(){
		return messageMapper.selectMsgList();
	}
	
	
	// addMessage -> 방명록 내용을 데이터베이스에 추가하는 기능
	public void addMessage(MessageDto msg) {
		System.out.println("애드메시지 서비스 실행");
		msg.setUpdateDate(LocalDateTime.now());
		messageMapper.insertMsg(msg);
	}
	
	
	// modifyMessage -> 메시지의 내용을 수정하는 기능
	// 성공시 true, 실패시 false
	// 작성한 비밀번호가 같을 때에만 수정기능 수행
	public boolean modifyMessage(MessageDto msg) {
		System.out.println("모디파이메시지 서비스 실행");
		// 수정할 데이터 가져옴
		// 아이디로 검색해서 수정할 데이터 가져옴
		MessageDto originMsg = messageMapper.selectMsg(msg.getMessageId());
		
		// 입력한 비밀번호와 원본에 있는 비밀번호가 같은지 비교
		if(msg.getPassword().equals(originMsg.getPassword())) {
			//originMsg = new MessageDto(msg.getMessageId(), msg.getGuestName(), msg.getPassword(), msg.getMessage(), msg.getWriteDate(), LocalDateTime.now());
			originMsg.setGuestName(msg.getGuestName());
			originMsg.setMessage(msg.getMessage());
			originMsg.setUpdateDate(LocalDateTime.now());
			messageMapper.updateMsg(originMsg);			
			return true;
		}
		return false;
	}
	
	// deleteMessage -> 작성한 메시지를 삭제하는 기능
	// 성공시 true, 실패시 false
	// 작성한 비밀번호가 같을 때에만 수정기능 수행
	public boolean deleteMessage(int messageId, String password) {

		MessageDto msg = messageMapper.selectMsg(messageId);
		if(msg.getPassword().equals(password)){
			messageMapper.deleteMsg(messageId);
			return true;
		}
		return false;
	}
	
	
}
