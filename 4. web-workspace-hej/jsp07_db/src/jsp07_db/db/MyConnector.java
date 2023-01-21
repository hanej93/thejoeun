package jsp07_db.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnector {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/tj_b?"
				+ "serverTimezone=Asia/Seoul&characterEncoding=utf-8";
		
		return DriverManager.getConnection(url, user, password);
	}
}
