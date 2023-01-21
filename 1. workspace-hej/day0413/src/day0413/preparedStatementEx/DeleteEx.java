package day0413.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnect.MyConnect;

public class DeleteEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하려는 id를 입력하세요");
		
		int id = sc.nextInt();
		
		String sql = "delete from employee where id=?";
		try(Connection conn = MyConnect.getConncet();
				PreparedStatement pstm = conn.prepareStatement(sql)){
			
			pstm.setInt(1, id);
			int rows = pstm.executeUpdate();
			System.out.println(rows +"개 삭제됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
