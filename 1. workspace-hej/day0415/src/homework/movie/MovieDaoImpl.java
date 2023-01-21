package homework.movie;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import dbconnect.MyConnect;

public class MovieDaoImpl implements MovieDao {

	private static MovieDaoImpl instance = new MovieDaoImpl();

	private MovieDaoImpl() {
	}

	public static MovieDaoImpl getInstance() {
		return instance;
	}

	@Override
	public Movie selectWithId(Movie movie) {

		Movie resultMovie = null;
		String sql = "select * from movie where id = ?";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {
			pstm.setInt(1, movie.getId());

			try (ResultSet rs = pstm.executeQuery()) {

				if (rs.next()) {
					resultMovie = new Movie();
					resultMovie.setId(rs.getInt("id"));
					resultMovie.setGenre(rs.getString("genre"));
					resultMovie.setDirector(rs.getString("director"));
					resultMovie.setScenario(rs.getString("scenario"));
					resultMovie.setTitle(rs.getString("title"));
					resultMovie.setProducer(rs.getString("producer"));
					resultMovie.setActor(rs.getString("actor"));
					resultMovie.setMusic(rs.getString("music"));
					if (rs.getDate("begin_filming") == null) {
						resultMovie.setBeginFilming(null);
					} else {
						resultMovie.setBeginFilming(rs.getDate("begin_filming").toLocalDate());
					}
					if (rs.getDate("end_filming") == null) {
						resultMovie.setEndFilming(null);
					} else {
						resultMovie.setEndFilming(rs.getDate("end_filming").toLocalDate());
					}
					resultMovie.setReleaseDate(rs.getDate("release_date").toLocalDate());
					resultMovie.setRunningTime(rs.getInt("running_time"));
					resultMovie.setProductionCost(rs.getInt("production_cost"));
					resultMovie.setNorthAmericaBoxOffice(rs.getLong("north_america_box_office"));
					resultMovie.setWorldBoxOffice(rs.getLong("world_box_office"));
					resultMovie.setKoreanNumberOfAudience(rs.getInt("korean_number_of_audience"));
					resultMovie.setRate(rs.getString("rate"));
					resultMovie.setwDate(rs.getTimestamp("w_date").toLocalDateTime());
					resultMovie.setuDate(rs.getTimestamp("u_date").toLocalDateTime());

				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultMovie;
	}

	@Override
	public List<Movie> selectList() {

		List<Movie> movieList = null;
		String sql = "select * from movie";
		try (Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()) {

			movieList = new ArrayList<Movie>();

			while (rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setGenre(rs.getString("genre"));
				movie.setDirector(rs.getString("director"));
				movie.setScenario(rs.getString("scenario"));
				movie.setTitle(rs.getString("title"));
				movie.setProducer(rs.getString("producer"));
				movie.setActor(rs.getString("actor"));
				movie.setMusic(rs.getString("music"));
				if (rs.getDate("begin_filming") == null) {
					movie.setBeginFilming(null);
				} else {
					movie.setBeginFilming(rs.getDate("begin_filming").toLocalDate());
				}
				if (rs.getDate("end_filming") == null) {
					movie.setEndFilming(null);
				} else {
					movie.setEndFilming(rs.getDate("end_filming").toLocalDate());
				}
				movie.setReleaseDate(rs.getDate("release_date").toLocalDate());
				movie.setRunningTime(rs.getInt("running_time"));
				movie.setProductionCost(rs.getInt("production_cost"));
				movie.setNorthAmericaBoxOffice(rs.getLong("north_america_box_office"));
				movie.setWorldBoxOffice(rs.getLong("world_box_office"));
				movie.setKoreanNumberOfAudience(rs.getInt("korean_number_of_audience"));
				movie.setRate(rs.getString("rate"));
				movie.setwDate(rs.getTimestamp("w_date").toLocalDateTime());
				movie.setuDate(rs.getTimestamp("u_date").toLocalDateTime());

				movieList.add(movie);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;
	}

	@Override
	public List<Movie> selectWithTitle(String title) {
		List<Movie> movieList = null;
		String sql = "select * from movie where title like ?";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setString(1, "%" + title + "%");
			movieList = new ArrayList<Movie>();

			try (ResultSet rs = pstm.executeQuery()) {
				while (rs.next()) {
					Movie movie = new Movie();
					movie.setId(rs.getInt("id"));
					movie.setGenre(rs.getString("genre"));
					movie.setDirector(rs.getString("director"));
					movie.setScenario(rs.getString("scenario"));
					movie.setTitle(rs.getString("title"));
					movie.setProducer(rs.getString("producer"));
					movie.setActor(rs.getString("actor"));
					movie.setMusic(rs.getString("music"));
					if (rs.getDate("begin_filming") == null) {
						movie.setBeginFilming(null);
					} else {
						movie.setBeginFilming(rs.getDate("begin_filming").toLocalDate());
					}
					if (rs.getDate("end_filming") == null) {
						movie.setEndFilming(null);
					} else {
						movie.setEndFilming(rs.getDate("end_filming").toLocalDate());
					}
					movie.setReleaseDate(rs.getDate("release_date").toLocalDate());
					movie.setRunningTime(rs.getInt("running_time"));
					movie.setProductionCost(rs.getInt("production_cost"));
					movie.setNorthAmericaBoxOffice(rs.getLong("north_america_box_office"));
					movie.setWorldBoxOffice(rs.getLong("world_box_office"));
					movie.setKoreanNumberOfAudience(rs.getInt("korean_number_of_audience"));
					movie.setRate(rs.getString("rate"));
					movie.setwDate(rs.getTimestamp("w_date").toLocalDateTime());
					movie.setuDate(rs.getTimestamp("u_date").toLocalDateTime());

					movieList.add(movie);
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;
	}

	@Override
	public int insert(Movie movie) {
		int result = 0;
		String sql = "INSERT INTO `tj_b`.`movie`" + "(`id`, " + "`genre`, " + "`director`, " + "`scenario`, "
				+ "`title`, " + "`producer`, " + "`actor`, " + "`music`, " + "`begin_filming`, " + "`end_filming`, "
				+ "`release_date`, " + "`running_time`, " + "`production_cost`, " + "`north_america_box_office`, "
				+ "`world_box_office`, " + "`korean_number_of_audience`, " + "`rate`) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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

//			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getwDate()));
//
//			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getuDate()));

			result = pstm.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int update(Movie movie) {
		int result = 0;

		String sql = "UPDATE `tj_b`.`movie` " + "SET " + "`id` = ?, " + "`genre` = ?, " + "`director` = ?, "
				+ "`scenario` = ?, " + "`title` = ?, " + "`producer` = ?, " + "`actor` = ?, " + "`music` = ?, "
				+ "`begin_filming` = ?, " + "`end_filming` = ?, " + "`release_date` = ?, " + "`running_time` = ?, "
				+ "`production_cost` = ?, " + "`north_america_box_office` = ?, " + "`world_box_office` = ?, "
				+ "`korean_number_of_audience` = ?, " + "`rate` = ?, " +
//				"`w_date` = ?, " + 
//				"`u_date` = ? " + 
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

//			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getwDate()));
//
//			pstm.setTimestamp(cnt++, Timestamp.valueOf(movie.getuDate()));

			pstm.setInt(cnt++, movie.getId());
			result = pstm.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

	@Override
	public int delete(Movie movie) {

		int result = 0;
		String sql = "delete from user where id = ?";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setInt(1, movie.getId());

			result = pstm.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int selectTotalCount() {

		int count = 0;

		String sql = "select count(*) from movie";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
			return count;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}
