package jsp08_mvc.guestbook.model;

import java.time.LocalDateTime;

public class MessageDto {
	private int messageId;
	private String guestName;
	private String message;
	private LocalDateTime writeDate;
	private LocalDateTime updateDate;
	public MessageDto() {
		super();
	}
	public MessageDto(int messageId, String guestName, String message, LocalDateTime writeDate,
			LocalDateTime updateDate) {
		super();
		this.messageId = messageId;
		this.guestName = guestName;
		this.message = message;
		this.writeDate = writeDate;
		this.updateDate = updateDate;
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
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "MessageDto [messageId=" + messageId + ", guestName=" + guestName + ", message=" + message
				+ ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";
	}
	
}
