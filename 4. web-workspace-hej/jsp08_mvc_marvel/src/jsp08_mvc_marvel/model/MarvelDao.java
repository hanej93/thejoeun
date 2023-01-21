package jsp08_mvc_marvel.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MarvelDao {
	private static MarvelDao instance = new MarvelDao();
	
	private MarvelDao() {}
	
	public static MarvelDao getInstance() {
		return instance;
	}

	public int selectTotalCount(Connection conn) throws SQLException {
		
		String sql ="select count(*) from marvel_movie";
		
		try(Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){
			if(rs.next()) {
				return rs.getInt(1);
			} else {
				return 0;
			}
			
		}
	}

	public List<MarvelDto> selectMarvelList(Connection conn, int firstRow, int messageCountPerPage) throws SQLException {
		
		String sql = "select marvel_id, title, title_eng,"
				+ " release_date, world_box_office, write_date, update_date "
				+ "from marvel_movie order by marvel_id desc limit ?,?";
		
		ArrayList<MarvelDto> marvelList = new ArrayList<MarvelDto>();
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, firstRow);
			pst.setInt(2, messageCountPerPage);
			
			try(ResultSet rs = pst.executeQuery()){
				while(rs.next()) {
					marvelList.add(new MarvelDto(
							rs.getInt("marvel_id"),
							rs.getString("title"),
							rs.getString("title_eng"),
							rs.getDate("release_date").toLocalDate() ,
							rs.getLong("world_box_office"),
							rs.getTimestamp("write_date").toLocalDateTime(),
							rs.getTimestamp("update_date").toLocalDateTime()
							));
				}
				return marvelList;
			}
		}
		
	}

	public void insert(Connection conn, MarvelDto marvelDto) throws SQLException {
		
		String sql = "insert into marvel_movie(marvel_id, title, title_eng, release_date, world_box_office,update_date)"
				+ " values(?,?,?,?,?,?)";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, 0);
			pst.setString(2, marvelDto.getTitle());
			pst.setString(3, marvelDto.getTitleEng());
			pst.setDate(4, Date.valueOf(marvelDto.getReleaseDate()));
			pst.setLong(5, marvelDto.getWorldBoxOffice());
			pst.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
			
			pst.executeUpdate();
		}
	}
	
	public MarvelDto selectMarvelById(Connection conn, int marvelId) throws SQLException {
	
		String sql = "select marvel_id, title, title_eng,"
				+ " release_date, world_box_office, write_date, update_date "
				+ "from marvel_movie where marvel_id = ?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, marvelId);
			
			try(ResultSet rs = pst.executeQuery()){
				if(rs.next()) {
				return new MarvelDto(
						rs.getInt("marvel_id"),
						rs.getString("title"),
						rs.getString("title_eng"),
						rs.getDate("release_date").toLocalDate(),
						rs.getLong("world_box_office"),
						rs.getTimestamp("write_date").toLocalDateTime(),
						rs.getTimestamp("update_date").toLocalDateTime() );
				} else {
					return null;
				}
				
			}
			
			
		}
		
		// TODO Auto-generated method stub
	}
	

	public void update(Connection conn, MarvelDto marvelDto) throws SQLException {
		
		String sql = "update marvel_movie set title=?, title_eng=?, "
				+ "release_date=?, world_box_office=?,update_date=? where marvel_id=?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setString(1, marvelDto.getTitle());
			pst.setString(2, marvelDto.getTitleEng());
			pst.setDate(3, Date.valueOf(marvelDto.getReleaseDate()));
			pst.setLong(4, marvelDto.getWorldBoxOffice());
			pst.setTimestamp(5, Timestamp.valueOf(marvelDto.getUpdateDate()));
			pst.setInt(6, marvelDto.getMarvelId());
			
			pst.executeUpdate();
		}
		
		
	}

	
	public void delete(Connection conn, int marvelId) throws SQLException {
		
		String sql = "delete from marvel_movie where marvel_id = ?";
		
		try(PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, marvelId);
			
			pst.executeUpdate();
		}
		
	}

	
	
	
	
	
	
	
}
