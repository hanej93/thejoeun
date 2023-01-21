package day0412.databaseEx01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {
	public static void main(String[] args) {
		
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// id, pw, url
			String id = "root";
			String pw = "mysql";
			String url = "jdbc:mysql://localhost:3306/tj_b?"
			+ "characterEncoding=utf-8&serverTimezone=Asia/Seoul";
			
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			/*
			 * create table employee(
					id int not null auto_increment primary key,
					name varchar(50) not null,
					salary int not null,
					hire_date timestamp not null comment "입사일"
					);

					// 테이블 다른 데이터베이스 옮기기
					alter table mytestdb.employee rename tj_b.employee;

					insert into employee values
					(0, "홍길동", 10000000, "2021-04-12 13:02:00"),
					(0, "브랜드", 20000000, "2021-04-12 13:03:00"),
					(0, "카타리나", 30000000, "2021-04-12 19:03:00");
			*/
			
			
			
			String sql = "select * from employee";
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.print(rs.getInt(1) +"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getInt("salary")+"\t");
//				System.out.print(rs.getString("hire_date")+"\t");
//				System.out.println("\n------------------------------------------------------");
				// 클래스에 담아보고 출력도 해보자
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getTimestamp("hire_date").toLocalDateTime());
				
				System.out.println(e);
						
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
