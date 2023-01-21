package day0413.statementEx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbconnect.MyConnect;

public class SelectEx {
	public static void main(String[] args) {
		// 사용자로부터 user_id와 password를 입력받아 조회
		Scanner sc = new Scanner(System.in);
		System.out.println("유저 아이디를 입력하세요>>");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요>>");
		String password = sc.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
	
			String sql = "select * from employee where user_id = '" + userId + "' and password = '" + password + "'";
			
			try(Connection conn = MyConnect.getConncet(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)){
				
				while(rs.next()) {
					System.out.print(rs.getInt("id") +"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("user_id")+"\t");
					System.out.print(rs.getString("password")+"\t");
					System.out.print(rs.getInt("salary")+"\t");
					System.out.print(rs.getTimestamp("hire_date")+"\t");
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
