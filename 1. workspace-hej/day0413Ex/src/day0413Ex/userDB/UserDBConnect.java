package day0413Ex.userDB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDBConnect {

	private User user;

	public UserDBConnect() {

		this.user = new User();
	}

	public void dbSelectWithUserId() {
		Scanner sc = new Scanner(System.in);

		String sql = "select * from user where user_id = ?";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			System.out.println("조회할 아이디를 입력해주세요.");
			user.setUserId(sc.nextLine());

			pstm.setString(1, user.getUserId());

			ResultSet rs = pstm.executeQuery();
			ResultSetMetaData rsmd = pstm.getMetaData();

			while (rs.next()) {
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					if (rsmd.getColumnTypeName(i).equals("INT")) {
						System.out.println(rsmd.getColumnName(i) + ": " + rs.getInt(i));
					} else if (rsmd.getColumnTypeName(i).equals("VARCHAR")) {
						System.out.println(rsmd.getColumnName(i) + ": " + rs.getString(i));
					} else if (rsmd.getColumnTypeName(i).equals("DATE")) {
						System.out.println(rsmd.getColumnName(i) + ": " + rs.getDate(i));
					} else if (rsmd.getColumnTypeName(i).equals("TIMESTAMP")) {
						System.out.println(rsmd.getColumnName(i) + ": " + rs.getTimestamp(i));
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	}

	public void dbSelectList() {
		String sql = "select * from user";
		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {
			List<User> userList = new ArrayList<User>();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				userList.add(new User());
				userList.get(userList.size() - 1).setId(rs.getInt("id"));
				userList.get(userList.size() - 1).setUserId(rs.getString("user_id"));
				userList.get(userList.size() - 1).setPassword(rs.getString("password"));
				userList.get(userList.size() - 1).setBirthDate(rs.getDate("birth_date").toLocalDate());
				userList.get(userList.size() - 1).setPhone(rs.getString("phone"));
				userList.get(userList.size() - 1).setAddress(rs.getString("address"));
				userList.get(userList.size() - 1).setJoinedDate(rs.getTimestamp("joined_date").toLocalDateTime());
			}

			for (User user2 : userList) {
				System.out.println(user2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public void dbInsert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		user.setUserId(sc.nextLine());
		System.out.println("비밀번호를 입력하세요");
		user.setPassword(sc.nextLine());
		System.out.println("생년월일을 입력하세요   yyyy-mm-dd");
		user.setBirthDate(LocalDate.parse(sc.nextLine()));
		System.out.println("전화번호를 입력하세요");
		user.setPhone(sc.nextLine());
		System.out.println("주소를 입력하세요");
		user.setAddress(sc.nextLine());
		System.out.println("가입일을 입력하세요 yyyy-mm-ddTHH:MM:ss");
		user.setJoinedDate(LocalDateTime.parse(sc.nextLine()));

		String sql = "insert into user values(0, ?, ?, ?, ?, ?, ?)";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			int cnt = 1;
			pstm.setString(cnt++, user.getUserId());
			pstm.setString(cnt++, user.getPassword());
//			pstm.setString(cnt++, user.getBirthDate().toString());
			pstm.setDate(cnt++, Date.valueOf(user.getBirthDate()));
			pstm.setString(cnt++, user.getPhone());
			pstm.setString(cnt++, user.getAddress());
			pstm.setString(cnt++, user.getJoinedDate().toString());
			
			int affectedRows = pstm.executeUpdate();
			System.out.println(affectedRows + "의 row를 삽입했습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void dbUpdate() {
		
		Scanner sc = new Scanner(System.in);
		String sql = "update user set id=?";

		System.out.println("id를 입력하세요");
		user.setId(Integer.parseInt(sc.nextLine()));

		System.out.println("이름을 입력하세요");
		user.setUserId(sc.nextLine());
		if (!user.getUserId().equals("")) {
			sql += ", user_id=?";
		}

		System.out.println("비밀번호를 입력하세요");
		user.setPassword(sc.nextLine());
		if (!user.getPassword().equals("")) {
			sql += ", password=?";
		}

		System.out.println("생년월일을 입력하세요   yyyy-mm-dd");
		String birthDate = sc.nextLine();
		if (!birthDate.equals("")) {
			user.setBirthDate(LocalDate.parse(birthDate));
			sql += ", birth_date=?";
		}

		System.out.println("전화번호를 입력하세요");
		user.setPhone(sc.nextLine());
		if (!user.getPhone().equals("")) {
			sql += ", phone=?";
		}

		System.out.println("주소를 입력하세요");
		user.setAddress(sc.nextLine());
		if (!user.getAddress().equals("")) {
			sql += ", address=?";
		}

		System.out.println("가입일을 입력하세요");
		String joinedDate = sc.nextLine();
		if (!joinedDate.equals("")) {
			user.setJoinedDate(LocalDateTime.parse(joinedDate));
			sql += ", joined_date=?";
		}

		sql += " where id = ?";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {
			int cnt = 1;

			pstm.setInt(cnt++, user.getId());
			if (!user.getUserId().equals("")) {
				pstm.setString(cnt++, user.getUserId());
			}
			if (!user.getPassword().equals("")) {
				pstm.setString(cnt++, user.getPassword());
			}
			if (!birthDate.equals("")) {
				pstm.setDate(cnt++, Date.valueOf(user.getBirthDate()));
			}
			if (!user.getPhone().equals("")) {
				pstm.setString(cnt++, user.getPhone());
			}
			if (!user.getAddress().equals("")) {
				pstm.setString(cnt++, user.getAddress());
			}
			if (!joinedDate.equals("")) {
				pstm.setString(cnt++, user.getJoinedDate().toString());
			}
			pstm.setInt(cnt++, user.getId());

			int rows = pstm.executeUpdate();
			System.out.println("수정 끝");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dbDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하세요");
		String id = sc.nextLine();

		String sql = "delete from user where id =?";

		try (Connection conn = MyConnect.getConnect(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			pstm.setInt(1, Integer.parseInt(id));

			int rows = pstm.executeUpdate();
			System.out.println(rows + "개 삭제됨");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
