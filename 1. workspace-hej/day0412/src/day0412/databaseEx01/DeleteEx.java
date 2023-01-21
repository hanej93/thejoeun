package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dbconnect.MyConnect;

public class DeleteEx {
	public static void main(String[] args) {
		try(Connection conn = MyConnect.getConnect();
				Statement st = conn.createStatement()){
			
			String sql = "delete from employee where id = 5;";
			
			int affectedRows = st.executeUpdate(sql);
			
			if(affectedRows > 0) {
				System.out.println(affectedRows+"row를 삭제함");
			}else {
				System.out.println("삭제 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
