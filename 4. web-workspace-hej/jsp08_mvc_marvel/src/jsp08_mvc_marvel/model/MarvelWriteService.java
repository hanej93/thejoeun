package jsp08_mvc_marvel.model;

import java.sql.Connection;
import java.sql.SQLException;

import jsp08_mvc_marvel.db.MyConnector;

public class MarvelWriteService {
	private MarvelDao marvelDao;
	
	public MarvelWriteService() {
		marvelDao = MarvelDao.getInstance();
	}
	
	public void writeMarvel(MarvelDto marvelDto) {
		
		try(Connection conn = MyConnector.getConnection()){
			
			marvelDao.insert(conn, marvelDto);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
