package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import dbconnect.MyConnect;

public class UpdateEx {
	public static void main(String[] args) {
		try(Connection conn = MyConnect.getConnect();
				Statement st = conn.createStatement()){
			
			Employee e = new Employee(5, "베인", 10000000, LocalDateTime.parse("2002-05-31T18:15:20"));
			
			String sql = "update employee set name='" 
			+e.getName()+ "', salary="
					+ e.getSalary() +", hire_date='"
			+e.getHireDate()+"' "
			+ "where id="+e.getId()+";";
			
			System.out.println(sql);
			
			int affectedRows = st.executeUpdate(sql);
			if(affectedRows > 0 ) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
