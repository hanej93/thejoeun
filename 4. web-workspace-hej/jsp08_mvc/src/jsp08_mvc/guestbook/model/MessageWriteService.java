package jsp08_mvc.guestbook.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc.guestbook.db.MyConnector;

public class MessageWriteService {
	private MessageDao messageDao;
	
	public MessageWriteService() {
		messageDao = MessageDao.getInstance();
	}
	
	public boolean writeMessage(MessageDto messageDto) {
		
		try(Connection conn = MyConnector.getConnection()){
			
			// dao를 이용해서 디비에 insert 해준다.
			messageDao.insert(conn, messageDto);
			
			return true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
