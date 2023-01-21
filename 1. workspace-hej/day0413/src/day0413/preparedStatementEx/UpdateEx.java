package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnect.MyConnect;

public class UpdateEx {
	public static void main(String[] args) {
		// 사용자로부터 바꾸려는 컬럼을 수정할 수 있는 기능
		// employee(id, name, user_id, password, salary, hire_date)
		// name을 바꾼다면?
		// update employee set name="값" where id = 값;
		// update employee set user_id="값" where id = 값;
		// update employee set name ="값", user_id="값" where id = 값;
		// update employee set id = 값 [, 컬럼 = 값 ] where id = 값;
		
		Scanner sc = new Scanner(System.in);
		
		String sql = "update employee set id=?";
		System.out.println("변경할 데이터의 id를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("name을 변경하시겠습니까? (변경하지 않으면 엔터)");
		String name = sc.nextLine();
		if(!name.equals("")) {
			sql += ", name=?";
		}
		
		System.out.println("유저아이디를 변경하시겠습니까? (변경하지 않으면 엔터)");
		String userId = sc.nextLine();
		if(!userId.equals("")) {
			sql += ", user_id=?";
		}
		
		System.out.println("비밀번호를 변경하시겠습니까? (변경하지 않으면 엔터)");
		String password = sc.nextLine();
		if(!password.equals("")) {
			sql += ", password=?";
		}
		
		System.out.println("연봉을 변경하시겠습니까? (변경하지 않으면 엔터)");
		String salary = sc.nextLine();
		if(!salary.equals("")) {
			sql += ", salary=?";
		}
		
		System.out.println("입사일을 변경하시겠습니까? (변경하지 않으면 엔터)");
		System.out.println("예) 2021-04-13 20:35:15");
		String hireDate = sc.nextLine();
		if(!hireDate.equals("")) {
			sql += ", hire_date=?";
		}
		
		sql += " where id =?";
		
		try(Connection conn = MyConnect.getConncet();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			pstm.setInt(1, Integer.parseInt(id));
			
			int cnt = 2;
			if(!name.equals("")) {
				pstm.setString(cnt++, name);
			}

			if(!userId.equals("")) {
				pstm.setString(cnt++, userId);
			}
			
			if(!password.equals("")) {
				pstm.setString(cnt++, password);
			}
			
			if(!salary.equals("")) {
				pstm.setInt(cnt++, Integer.parseInt(salary));
			}
			
			if(!hireDate.equals("")) {
				pstm.setString(cnt++, hireDate);
			}
			
			pstm.setInt(cnt++, Integer.parseInt(id));
			
			int rows = pstm.executeUpdate();
			System.out.println(rows + " 수정 끝");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
