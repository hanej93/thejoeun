package day0331.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		
		// 디비 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// mysql id, pwd
			String id = "root";
			String pwd = "mysql";

			// url
			String url = "jdbc:mysql://localhost:3306/mytestdb?" 
			+ "characterEncoding=utf-8&serverTimezone=Asia/Seoul";

			// 접속, 커넥션 객체 받기
			conn = DriverManager.getConnection(url, id, pwd);

			// 쿼리를 실행해보자!
			// 조회를 하기 위한 쿼리를 만들자
			String query = "select * from books";

			// mysql에 쿼리를 실행시켜주는 객체 statement를
			// connection 객체로부터 받아온다.
			Statement stmt = conn.createStatement();

			// 쿼리를 실행할 것임
			// select는 결과가 있기 때문에 그것을 담기 위한 ResultSet이라는 객체에 담는다.
			ResultSet rs = stmt.executeQuery(query);

			// 결과를 출력해보자.
			// re.next()는 커서가 옮겨진다. (row를 하나씩 접근)
			while (rs.next()) {
				// 데이터는 컬럼별로 가져온다.

				// getInt(컬럼명)
				int booksId = rs.getInt("id");
				String title = rs.getString("title");
				String subTitle = rs.getString(3);
				String publisher = rs.getString(4);
				String publicationDate = rs.getString(5);
				int price = rs.getInt(6);
				System.out.println("id : " + booksId);
				System.out.println("title : " + title);
				System.out.println("subTitle : " + subTitle);
				System.out.println("publisher : " + publisher);
				System.out.println("publicationDate : " + publicationDate);
				System.out.println("price : " + price);
				
				System.out.println();
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
