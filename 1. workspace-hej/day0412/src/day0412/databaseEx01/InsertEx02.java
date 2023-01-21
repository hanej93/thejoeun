package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import dbconnect.MyConnect;

public class InsertEx02 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = MyConnect.getConnect();

//			"2002-05-31 18:15:20"
//			LocalDateTime hireDate = LocalDateTime.of(2002, 5, 31, 18, 15, 20);
			LocalDateTime hireDate = LocalDateTime.parse("2002-05-31T18:15:20");

			// 객체에 담은 데이터를 이용하여 DB에 값을 넣자
			Employee e = new Employee(0, "베인", 10000, hireDate);

			Statement st = conn.createStatement();
			String sql = "insert into employee(id,name,salary,hire_date) " + "values(" + e.getId() + ",'" + e.getName()
					+ "'," + e.getSalary() + ",'" + e.getHireDate() + "');";
			System.out.println(sql);

			int affectedRows = st.executeUpdate(sql);
			if(affectedRows >0) {
				System.out.println("삽입 성공!");
			} else {
				System.out.println("삽입 실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
