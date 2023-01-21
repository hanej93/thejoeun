package jsp08_mvc_marvel.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc_marvel.db.MyConnector;

public class MarvelUpdateService {
	MarvelDao marvelDao;
	
	public MarvelUpdateService() {
		marvelDao = MarvelDao.getInstance();
	}

	public void updateMarvel(MarvelDto marvelDto) {
		
		try(Connection conn = MyConnector.getConnection()){
			
			marvelDao.update(conn, marvelDto);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
