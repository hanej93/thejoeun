package jsp08_mvc.guestbook.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc.guestbook.db.MyConnector;

public class MessageUpdateService {
private MessageDao messageDao;
	
	public MessageUpdateService() {
		messageDao = MessageDao.getInstance();
	}
	
	public boolean messageUpdate(MessageDto messageDto) {
		
		try(Connection conn = MyConnector.getConnection()){
			
			messageDao.update(conn, messageDto);
			
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
