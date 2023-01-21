package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnect.MyConnect;

public class InsertEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("아이디를 입력하세요");
		String userId = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String password = sc.next();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		System.out.println("입사일을 입력하세요 yyyy-MM-dd HH:mm:ss 형태로");
		sc.nextLine();
		String hireDate = sc.nextLine();

		System.out.println("다 입력받음!");

		String sql = "insert into employee(name, user_id, password, salary, hire_date) " + "values(?, ?, ?, ?, ?)";

		try (Connection conn = MyConnect.getConncet(); PreparedStatement pstm = conn.prepareStatement(sql)) {

			// 물음표에 값 세팅
			pstm.setString(1, name);
			pstm.setString(2, userId);
			pstm.setString(3, password);
			pstm.setInt(4, salary);
			pstm.setString(5, hireDate);

			int affectedRows = pstm.executeUpdate();
			System.out.println(affectedRows + "의 row를 삽입했습니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("삽입을 실패했습니다.");
			e.printStackTrace();
		}

	}
}
