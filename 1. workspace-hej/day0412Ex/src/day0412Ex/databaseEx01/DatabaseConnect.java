package day0412Ex.databaseEx01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class DatabaseConnect {
	public static void main(String[] args) {
		try (Connection conn = MyConnect.getConnect(); Statement st = conn.createStatement()) {

			Scanner sc = new Scanner(System.in);
			Student stu = new Student();
			while (true) {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("================");
				System.out.println("    1. 조회");
				System.out.println("    2. 삽입");
				System.out.println("    3. 수정");
				System.out.println("    4. 삭제");
				System.out.println("    5. 부가기능");
				System.out.println("================");
				System.out.println();
				System.out.println();
				System.out.println("기능 선택(1 ~ 5)");
				int choice = sc.nextInt();
				if (choice == 1) {

					System.out.println("조회할 이름을 선택해주세요");

					String name = sc.next();
					String sql = "select * from student where name = '" + name + "';";
					ResultSet rs = st.executeQuery(sql);
					while (rs.next()) {
						stu.setName(rs.getString("name"));
						stu.setBirth_date(rs.getDate("birth_date").toLocalDate());
						stu.setKor(rs.getInt("kor"));
						stu.setEng(rs.getInt("eng"));
						stu.setMath(rs.getInt("math"));
						System.out.println(stu);
					}

				}
				if (choice == 2) {
					System.out.println("데이터 삽입을 선택하셨습니다.");
					System.out.println("-------------------------------");
					stu.setId(0);
					System.out.println("이름을 입력해주세요.");
					String name = sc.next();
					stu.setName(name);

					System.out.println("생년월일을 입력해주세요.(yyyy-mm-dd)");
					String date = sc.next();
					LocalDate localdate = LocalDate.parse(date);
					stu.setBirth_date(localdate);

					System.out.println("국어점수를 입력해주세요");
					int kor = sc.nextInt();
					stu.setKor(kor);
					System.out.println("영어점수를 입력해주세요");
					int eng = sc.nextInt();
					stu.setEng(eng);
					System.out.println("수학점수를 입력해주세요");
					int math = sc.nextInt();
					stu.setMath(math);

					String sql = "insert into student values " + "(" + stu.getId() + ",'" + stu.getName() + "','"
							+ stu.getBirth_date() + "'," + stu.getKor() + "," + stu.getEng() + "," + stu.getMath()
							+ ");";

					int affectedRows = st.executeUpdate(sql);
					if (affectedRows > 0) {
						System.out.println("삽입 성공!");
					} else {
						System.out.println("삽입 실패");
					}
				}
				if (choice == 3) {
					System.out.println("데이터 수정을 선택하셨습니다.");
					System.out.println("-------------------------------");

					System.out.println("수정할 아이디를 입력해주세요.");
					int id = sc.nextInt();
					stu.setId(id);
					String sql = "update student set id = " + stu.getId();
					System.out.println("이름을 수정하시겠습니까? y/n");
					String yn = sc.next();
					if (yn.equals("y")) {
						System.out.println("이름을 입력해주세요.");
						String name = sc.next();
						stu.setName(name);
						sql += ", name = '" + stu.getName() + "'";
					}

					System.out.println("생년월일을 수정하시겠습니까? y/n");
					yn = sc.next();
					if (yn.equals("y")) {
						System.out.println("생년월일을 입력해주세요.(yyyy-mm-dd)");
						String date = sc.next();
						LocalDate localdate = LocalDate.parse(date);
						stu.setBirth_date(localdate);
						sql += ", birth_date = '" + stu.getBirth_date() + "'";
					}

					System.out.println("국어점수를 수정하시겠습니까? y/n");
					yn = sc.next();
					if (yn.equals("y")) {
						System.out.println("국어점수를 입력해주세요");
						int kor = sc.nextInt();
						stu.setKor(kor);
						sql += ", kor = " + stu.getKor();
					}

					System.out.println("영어점수를 수정하시겠습니까? y/n");
					yn = sc.next();
					if (yn.equals("y")) {
						System.out.println("영어점수를 입력해주세요");
						int eng = sc.nextInt();
						stu.setEng(eng);
						sql += ", eng = " + stu.getEng();
					}

					System.out.println("수학점수를 수정하시겠습니까? y/n");
					yn = sc.next();
					if (yn.equals("y")) {
						System.out.println("수학점수를 입력해주세요");
						int math = sc.nextInt();
						stu.setMath(math);
						sql += ", math = " + stu.getMath();
					}

					sql += " where id = " + stu.getId() + ";";

					int affectedRows = st.executeUpdate(sql);
					if (affectedRows > 0) {
						System.out.println();
						System.out.println("삽입 성공!!!");
					} else {
						System.out.println();
						System.out.println("삽입 실패!!!");
					}
				}
				
				if(choice == 4) {
					System.out.println("데이터 삭제를 선택하셨습니다.");
					System.out.println("-------------------------------");
					System.out.println("삭제할 아이디를 입력해주세요.");
					int id = sc.nextInt();
					String sql = "delete from student where id = " + id;
					int affectedRows = st.executeUpdate(sql);
					if (affectedRows > 0) {
						System.out.println();
						System.out.println("삭제 성공!");
					} else {
						System.out.println();
						System.out.println("삭제 실패");
					}
					
				}
				
				if(choice == 5) {
					System.out.println("수정할 auto_increment 값을 입력해주세요.");
					int autoInc = sc.nextInt();
					
					String sql = "alter table student auto_increment=" + autoInc;
					int affectedRows = st.executeUpdate(sql);
					if (affectedRows > 0) {
						System.out.println();
						System.out.println("수정 성공!");
					} else {
						System.out.println();
						System.out.println("수정 실패");
					}
				}
				else {
					System.out.println("번호를 제대로 입력하라구!!");
					System.out.println();
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
