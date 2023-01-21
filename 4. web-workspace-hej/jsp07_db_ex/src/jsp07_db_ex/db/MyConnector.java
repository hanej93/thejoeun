package jsp07_db_ex.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnector {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "root"; // DB 접속 아이디
		String password ="mysql"; // DB 접속 비밀번호
		String url = "jdbc:mysql://localhost:3306/tj_b?"
				+ "serverTimezone=Asia/Seoul&characterEncoding=utf-8";
		
		return DriverManager.getConnection(url, user, password);
	}
}