package jsp08_mvc.guestbook.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jsp08_mvc.guestbook.db.MyConnector;

// 리스트 화면에 필요한 데이터를 만들어주는
// 비지니스 로직을 처리하는 아이
public class MessageListService {
	static final int MESSAGE_COUNT_PER_PAGE = 3; // 한 페이지당 보여줄 개수
	private MessageDao messageDao;

	public MessageListService() {
		messageDao = MessageDao.getInstance();
	}

	// 한 화면에 보여줄 MessageListView라는 데이터를 만들어주는 메서드
	public MessageListView getMessageListView(int pageNumber) {
		MessageListView messageListView = null;

		try (Connection conn = MyConnector.getConnection()) {
			// 전체 페이지 개수
			int messageTotalCount = messageDao.selectTotalCount(conn);

			// 메시지 리스트
			List<MessageDto> messageList = null;
			int firstRow = 0;

			// firstRow를 세팅
			if (messageTotalCount > 0) {
				firstRow = (pageNumber - 1) * MESSAGE_COUNT_PER_PAGE;
			} else {
				pageNumber = 0; // 현재 페이지 번호를 0으로 함
			}
			
			// 방명록 리스트를 dao를 통해 가져오기
			messageList = messageDao.selectMessageList(conn, firstRow, MESSAGE_COUNT_PER_PAGE);
			
			// 화면에 보내줄 모든 데이터를 객체 안에 넣어 세팅
			messageListView = new MessageListView(messageTotalCount, pageNumber, messageList,
					MESSAGE_COUNT_PER_PAGE, firstRow);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return messageListView;

	}
}
