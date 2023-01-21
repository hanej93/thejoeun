package jsp08_mvc_marvel.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jsp08_mvc_marvel.db.MyConnector;

public class MarvelListService {
	static final int Message_Count_Per_Page = 3;
	private MarvelDao marvelDao;
	
	public MarvelListService() {
		marvelDao = MarvelDao.getInstance();
	}
	
	// MarvelListView 필드값 세팅
	public MarvelListView getMarvelListView(int currentPageNumber) {
		
		MarvelListView marvelListView = null;
		
		try(Connection conn = MyConnector.getConnection()){
			
			
//			private int messageTotalCount; // 총메시지개수
//			private int currentPageNumber; // 현재페이지
//			private int pageTotalCount; // 총 페이지
//			private int messageCountPerPage;
//			private int firstRow; // 시작로우
//			private List<MarvelDto> marvelList;
			
			int messageTotalCount = marvelDao.selectTotalCount(conn);
			int firstRow = 0;
			if(messageTotalCount > 0) {
				firstRow = (currentPageNumber - 1) * Message_Count_Per_Page;
			} else {
				currentPageNumber = 0;
			}
			
			List<MarvelDto> marvelList = marvelDao.selectMarvelList(conn, firstRow, Message_Count_Per_Page);
			
			marvelListView = new MarvelListView(messageTotalCount, currentPageNumber, Message_Count_Per_Page, firstRow, marvelList);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return marvelListView;
	}
}
