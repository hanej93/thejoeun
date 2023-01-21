package jsp07_db.model;

import java.time.LocalDateTime;

// DTO : Data Trnasfer Object: 데이터 전송 객체

public class MessageDto {
	private int messageId;
	private String guestName;
	private String message;
	private LocalDateTime writeDate;
	
	public MessageDto() {}

	public MessageDto(int messageId, String guestName, String message, LocalDateTime writeDate) {
		super();
		this.messageId = messageId;
		this.guestName = guestName;
		this.message = message;
		this.writeDate = writeDate;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "MessageDto [messageId=" + messageId + ", guestName=" + guestName + ", message=" + message
				+ ", writeDate=" + writeDate + "]";
	}
	
}
