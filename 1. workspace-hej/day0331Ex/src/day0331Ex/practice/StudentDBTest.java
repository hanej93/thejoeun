package day0331Ex.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDBTest {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id = "root";
			String pwd = "mysql";
			
			String url = "jdbc:mysql://localhost:3306/mytestdb_b?"
			+ "characterEncoding=utf-8&serverTimezone=Asia/Seoul";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String query = "select * from student";
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
