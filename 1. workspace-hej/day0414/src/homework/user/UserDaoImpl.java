package homework.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dbconnect.MyConnect;

public class UserDaoImpl implements UserDao { // date access object
	// 싱글톤 패턴(디자인 패턴)
	// 객체를 만드는 방법 중 한가지
	// 객체를 한 번만 만들도록 하는 방식
	// UserDao 객체를 안에서 만든다.

	private static UserDaoImpl instance = new UserDaoImpl();

	// 외부에서 객체 생성을 못하도록 막는다.
	private UserDaoImpl() {
	}

	// 객체를 받아볼 수 있는 메서드를 제공한다.
	public static UserDaoImpl getInstance() {
		return instance;
	}

	@Override
	public User selectWithUserId(User user) {

		String sql = "select * from user where user_id = ?";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setString(1, user.getUserId());

			try (ResultSet rs = pstm.executeQuery()) {

				if (rs.next()) {
					User resultUser = new User();
					resultUser.setId(rs.getInt("id"));
					resultUser.setUserId(rs.getString("user_id"));
					resultUser.setPassword(rs.getString("password"));
//					resultUser.setBirthDate(LocalDate.parse(rs.getString("birth_date")));
					resultUser.setBirthDate(rs.getDate("birth_date").toLocalDate());
					resultUser.setPhone(rs.getString("phone"));
					resultUser.setAddress(rs.getString("address"));
//					resultUser.setJoinedDate(LocalDateTime.parse(rs.getString("joined_date"));
					resultUser.setJoinedDate(LocalDateTime.parse(rs.getString("joined_date"),
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//					resultUser.setJoinedDate(rs.getTimestamp("joined_date").toLocalDateTime());
					return resultUser;
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<User> selectList() {
		List<User> userList = null;
		String sql = "select id, user_id, password, birth_date, phone, address, joined_date "
				+ "from user";
		
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery()){
				userList = new ArrayList<User>();
			while(rs.next()) {
				User user = new User(rs.getInt("id"),
						rs.getString("user_id"),
						rs.getString("password"),
						rs.getDate("birth_date").toLocalDate(),
						rs.getString("phone"),
						rs.getString("address"),
						rs.getTimestamp("joined_date").toLocalDateTime());
				userList.add(user);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return userList;
	}

	@Override
	public int insert(User user) {
		int result = 0;
		String sql = "insert into user "
				+ "values(?, ?, ?, ?, ?, ?, ?)";
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			int cnt = 1;
			pstm.setInt(cnt++, user.getId());
			pstm.setString(cnt++, user.getUserId());
			pstm.setString(cnt++, user.getPassword());
			//pstm.setString(cnt++, user.getBirthDate().toString());
			pstm.setDate(cnt++, Date.valueOf(user.getBirthDate()));
			pstm.setString(cnt++, user.getPhone());
			pstm.setString(cnt++, user.getAddress());
			//pstm.setString(cnt++, user.getJoinedDate().toString());
			pstm.setTimestamp(cnt++, Timestamp.valueOf(user.getJoinedDate()));
			
			result = pstm.executeUpdate();
			
			return result;
			
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
	public int update(User user) {
		int result = 0;
		String sql = "update user set user_id=?,password=?,birth_date=?,phone=?,address=?,joined_date=? "
				+ "where id =?";
		
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			int cnt = 1;
			pstm.setString(cnt++, user.getUserId());
			pstm.setString(cnt++, user.getPassword());
			pstm.setString(cnt++, user.getBirthDate().toString());
			pstm.setString(cnt++, user.getPhone());
			pstm.setString(cnt++, user.getAddress());
			pstm.setString(cnt++, user.getJoinedDate().toString());
			pstm.setInt(cnt++, user.getId());

			
			result = pstm.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(User user) {
		int result = 0;
		String sql = "delete from user where id=?";
		try(Connection conn = MyConnect.getConnect();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			pstm.setInt(1, user.getId());
			
			result = pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
