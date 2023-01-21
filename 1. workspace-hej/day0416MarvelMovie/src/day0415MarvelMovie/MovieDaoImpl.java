package day0415MarvelMovie;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDate;
import java.util.List;

import dbconnect.MyConnect;

public class MovieDaoImpl implements MovieDao {

	@Override
	public Movie selectWithId(int id) throws ClassNotFoundException, SQLException {

		String sql = "select * from movie where id = ?";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setInt(1, id);

			try (ResultSet rs = pstm.executeQuery()) {
				if (rs.next()) {
					// null일 수 있는 아이를 변수로 따로 받음
					Date beginFilmingDate = rs.getDate("begin_filming");
					LocalDate beginFilming = (beginFilmingDate == null) ? null : beginFilmingDate.toLocalDate();
					
					Date endFilmingDate = rs.getDate("end_filming");
					LocalDate endFilming = (endFilmingDate == null) ? null : endFilmingDate.toLocalDate();
					return new Movie.Builder()
                            .setId(rs.getInt("id"))
                            .setGenre(rs.getString("genre"))
                            .setDirector(rs.getString("director"))
                            .setScenario(rs.getString("scenario"))
                            .setTitle(rs.getString("title"))
                            .setProducer(rs.getString("producer"))
                            .setActor(rs.getString("actor"))
                            .setMusic(rs.getString("music"))
                            .setBeginFilming(beginFilming)
                            .setEndFilming(endFilming)
                            .setReleaseDate(rs.getDate("release_date").toLocalDate())
                            .setRunningTime(rs.getInt("running_time"))
                            .setProductionCost(rs.getInt("production_cost"))
                            .setNorthAmericaBoxOffice(rs.getLong("north_america_box_office"))
                            .setWorldBoxOffice(rs.getLong("world_box_office"))
                            .setKoreanNumberOfAudience(rs.getInt("korean_number_of_audience"))
                            .setRate(rs.getString("rate"))
                            .setwDate(rs.getTimestamp("w_date").toLocalDateTime())
                            .setuDate(rs.getTimestamp("u_date").toLocalDateTime())
                            .build();
					
				} else {
					return null;
				}
			}

		}
	}

	@Override
	public List<Movie> selectList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> selectWithTitle() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Movie movie) throws ClassNotFoundException, SQLException {

		String sql = "insert into movie " + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			int cnt = 1;

			pstm.setInt(cnt++, movie.getId());
			pstm.setString(cnt++, movie.getGenre());
			pstm.setString(cnt++, movie.getDirector());
			pstm.setString(cnt++, movie.getScenario());
			pstm.setString(cnt++, movie.getTitle());
			pstm.setString(cnt++, movie.getProducer());
			pstm.setString(cnt++, movie.getActor());
			pstm.setString(cnt++, movie.getMusic());
			if (movie.getBeginFilming() == null) {
				pstm.setNull(cnt++, Types.DATE);
			} else {
				pstm.setDate(cnt++, Date.valueOf(movie.getBeginFilming()));
			}

			if (movie.getEndFilming() == null) {
				pstm.setNull(cnt++, Types.DATE);
			} else {
				pstm.setDate(cnt++, Date.valueOf(movie.getEndFilming()));
			}
			pstm.setDate(cnt++, Date.valueOf(movie.getReleaseDate()));
			pstm.setInt(cnt++, movie.getRunningTime());
			pstm.setInt(cnt++, movie.getProductionCost());
			pstm.setLong(cnt++, movie.getNorthAmericaBoxOffice());
			pstm.setLong(cnt++, movie.getWorldBoxOffice());

			if (movie.getKoreanNumberOfAudience() == 0) {
				pstm.setNull(cnt++, Types.INTEGER);
			} else {
				pstm.setInt(cnt++, movie.getKoreanNumberOfAudience());
			}
			pstm.setString(cnt++, movie.getRate());

			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getwDate()));

			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getuDate()));

			return pstm.executeUpdate();
		}
	}

	@Override
	public int update(Movie movie) throws ClassNotFoundException, SQLException {

		String sql = "UPDATE `tj_b`.`movie` " + "SET " + "`id` = ?, " + "`genre` = ?, " + "`director` = ?, "
				+ "`scenario` = ?, " + "`title` = ?, " + "`producer` = ?, " + "`actor` = ?, " + "`music` = ?, "
				+ "`begin_filming` = ?, " + "`end_filming` = ?, " + "`release_date` = ?, " + "`running_time` = ?, "
				+ "`production_cost` = ?, " + "`north_america_box_office` = ?, " + "`world_box_office` = ?, "
				+ "`korean_number_of_audience` = ?, " + "`rate` = ?, " +
				"`w_date` = ?, " + 
				"`u_date` = ? " + 
				"WHERE `id` = ?;";
		
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			int cnt = 1;

			pstm.setInt(cnt++, movie.getId());
			pstm.setString(cnt++, movie.getGenre());
			pstm.setString(cnt++, movie.getDirector());
			pstm.setString(cnt++, movie.getScenario());
			pstm.setString(cnt++, movie.getTitle());
			pstm.setString(cnt++, movie.getProducer());
			pstm.setString(cnt++, movie.getActor());
			pstm.setString(cnt++, movie.getMusic());
			if (movie.getBeginFilming() == null) {
				pstm.setNull(cnt++, Types.DATE);
			} else {
				pstm.setDate(cnt++, Date.valueOf(movie.getBeginFilming()));
			}

			if (movie.getEndFilming() == null) {
				pstm.setNull(cnt++, Types.DATE);
			} else {
				pstm.setDate(cnt++, Date.valueOf(movie.getEndFilming()));
			}
			pstm.setDate(cnt++, Date.valueOf(movie.getReleaseDate()));
			pstm.setInt(cnt++, movie.getRunningTime());
			pstm.setInt(cnt++, movie.getProductionCost());
			pstm.setLong(cnt++, movie.getNorthAmericaBoxOffice());
			pstm.setLong(cnt++, movie.getWorldBoxOffice());

			if (movie.getKoreanNumberOfAudience() == 0) {
				pstm.setNull(cnt++, Types.INTEGER);
			} else {
				pstm.setInt(cnt++, movie.getKoreanNumberOfAudience());
			}
			pstm.setString(cnt++, movie.getRate());

			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getwDate()));

			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getuDate()));
			
			pstm.setInt(cnt++, movie.getId());

			return pstm.executeUpdate();
		}
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectTotalCount() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
