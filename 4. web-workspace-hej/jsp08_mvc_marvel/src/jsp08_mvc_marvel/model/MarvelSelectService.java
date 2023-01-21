package jsp08_mvc_marvel.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp08_mvc_marvel.db.MyConnector;

public class MarvelSelectService{
	private MarvelDao marvelDao;
	
	public MarvelSelectService() {
		marvelDao = MarvelDao.getInstance();
	}
	
	public MarvelDto getMarvel(int marvelId) {
		
		try(Connection conn = MyConnector.getConnection()){
			MarvelDto marvelDto = marvelDao.selectMarvelById(conn, marvelId);
			
			
			return marvelDto;
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
}
