package homework.movie;

import java.util.List;

public interface MovieDao {
	public Movie  selectWithId(Movie movie);
	
	public List<Movie> selectList();
	
	public List<Movie> selectWithTitle(String title);
	
	public int insert(Movie movie);
	
	public int update(Movie movie);
	
	public int delete(Movie movie);
	
	public int selectTotalCount();
	
}
