package jsp08_mvc.guestbook.model;

import java.util.List;

// 방명록 화면을 보여주기 위해 필요한 데이터를 담는 아이
// 리스트화면에 필요한 내용
// 페이지 번호, 페이지 목록(리스트), 전체 메시지 개수, 페이지 개수, 페이지당 보여줄 메시지 개수
public class MessageListView {
	private int messageTotalCount; // 메시지 전체 개수
	private int currentPageNumber; // 현재 페이지 번호
	private List<MessageDto> messageList; // 한 화면(현재화면)에 보여줄 메시지 리스트
	private int pageTotalCount; // 전체 페이지 개수
	private int messageCountPerPage; // 페이지당 메시지 개수
	private int firstRow; // 화면상 맨 위에 있는 로우 번호
	
	
	public MessageListView(int messageTotalCount, int currentPageNumber, List<MessageDto> messageList
			, int messageCountPerPage, int firstRow) {
		super();
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageList = messageList;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = firstRow;
		
		// 전체 페이지 개수
		if(messageCountPerPage == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = (int)Math.ceil((double)messageTotalCount / messageCountPerPage);
		}
		
	}


	public int getMessageTotalCount() {
		return messageTotalCount;
	}


	public int getCurrentPageNumber() {
		return currentPageNumber;
	}


	public List<MessageDto> getMessageList() {
		return messageList;
	}


	public int getPageTotalCount() {
		return pageTotalCount;
	}


	public int getMessageCountPerPage() {
		return messageCountPerPage;
	}


	public int getFirstRow() {
		return firstRow;
	}
	
	
	
}
