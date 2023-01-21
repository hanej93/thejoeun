package com.myapp.guestbook;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	private MessageMapper messageMapper;

	//getMessageList 방명록 내용을 모두 가져와 list타입으로 반환하는 기능
	public List<MessageDto> getMessageList(){
		return messageMapper.selectMsgList();
	}

	//addMessage 방명록 내용을 데이타 베이스에 추가하는 기능
	public boolean addMessage(MessageDto messageDto) {
		messageDto.setMessageId(0);
		messageDto.setWriteDate(LocalDateTime.now());
		messageDto.setUpdateDate(LocalDateTime.now());
		boolean addMessage = messageMapper.insertMsg(messageDto);
		return addMessage;
	}
	
	//getMessage messageId에 해당하는 방명록 내용을 가져와 MessageDto타입으로 반환하는 기능
	public MessageDto getMessage(int messageId) {
		return messageMapper.selectMsg(messageId);
	}
	
	//modifyMessage 메시지의 내용을 수정하는 기능, 성공 시 true반환 실패시 false반환 단, 작성한 비밀번호가 같을 때에만 수정기능을 수행한다.
	
	// 사용자가 입력한 정보를 messageDto에 담아서 오고 (아이디, 수정할 데이터 + 비밀번호가 포함)
	// 수정한 객체는 msg 적용해서 업데이트 시킴
	public boolean modifyMessage(MessageDto messageDto) { // 이름 번호 암호 내용 이외에는 null
		MessageDto msg = messageMapper.selectMsg(messageDto.getMessageId());
		// 사용자가 가져온 객체의 비밀번호와 아이디로 조회한 객체의 비밀번호 일치 확인
		if(messageDto.getPassword().equals(msg.getPassword())) {
//			msg = new MessageDto(messageDto.getMessageId(), messageDto.getGuestName(), messageDto.getPassword(),
//					messageDto.getMessage(), msg.getWriteDate(), LocalDateTime.now());
			msg.setGuestName(messageDto.getGuestName());
			msg.setMessage(messageDto.getMessage());
			msg.setUpdateDate(LocalDateTime.now());
			return messageMapper.updateMsg(msg);
		}
		return false;
		
	}
	
	//deleteMessage 작성한 메시지를 삭제하는 기능, 성공 시 true 바환 실패시 false 반환 단, 작성한 비밀번호가 같을 때에만 삭제기능을 수행한다.
	public boolean deleteMessage(int messageId, String password) {
		MessageDto msg = messageMapper.selectMsg(messageId);
		
		if(msg.getPassword().equals(password)) {
			boolean deleteMessage = messageMapper.deleteMsg(messageId);
			return deleteMessage;
		}
		return false;
	}
}
