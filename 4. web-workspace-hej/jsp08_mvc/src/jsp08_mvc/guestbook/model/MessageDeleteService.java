package jsp08_mvc.guestbook.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc.guestbook.db.MyConnector;

public class MessageDeleteService {
	private MessageDao messageDao;
	
	public MessageDeleteService() {
		messageDao = MessageDao.getInstance();
	}
	
	public boolean messageDelete(int messageId) {
		
		try(Connection conn = MyConnector.getConnection()){
			
			messageDao.delete(conn, messageId);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		
	}
		
}
