package jsp08_mvc_marvel.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc_marvel.db.MyConnector;

public class MarvelDeleteService {
	private MarvelDao marvelDao;
	
	public MarvelDeleteService() {
		marvelDao = MarvelDao.getInstance();
	}

	public void deleteMarvel(int marvelId) {
		
		try(Connection conn = MyConnector.getConnection()){
			marvelDao.delete(conn, marvelId);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
