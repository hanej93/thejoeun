package day0415MarvelMovie;

import java.sql.SQLException;
import java.util.List;

public interface MovieDao {

	//id로 movie를 조회하는 메서드
	public Movie selectWithId(int id) throws ClassNotFoundException, SQLException;
	
	// movie 전체를 조회하는 메서드
	public List<Movie> selectList() throws ClassNotFoundException, SQLException;
	
	// 제목으로 movie를 조회하는 메서드
	public List<Movie> selectWithTitle() throws ClassNotFoundException, SQLException;
	
	// movie 추가
	public int insert(Movie movie) throws ClassNotFoundException, SQLException;
	
	// movie 수정
	public int update(Movie movie) throws ClassNotFoundException, SQLException;
	
	// movie 삭제
	public int delete(int id) throws ClassNotFoundException, SQLException;
	
	// 전체 개수
	public int selectTotalCount() throws ClassNotFoundException, SQLException;
	
	
}
