package day0413Ex.userDB;

import java.util.Scanner;

public class DBConnectTest {
	public static void main(String[] args) {

		UserDBConnect udbc = new UserDBConnect();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("================");
			System.out.println("  1. SelectWithUserId");
			System.out.println("  2. SelectList");
			System.out.println("  3. insert");
			System.out.println("  4. update");
			System.out.println("  5. delete");
			System.out.println("================");
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("사용할 기능을 선택해주세요.");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("아이디 조회 기능을 선택하셨습니다.");
				System.out.println();
				System.out.println();
				System.out.println();
				udbc.dbSelectWithUserId();
			} else if (choice == 2) {
				System.out.println("전체 조회 기능을 선택하셨습니다.");
				System.out.println();
				System.out.println();
				System.out.println();
				udbc.dbSelectList();
			} else if (choice == 3) {
				System.out.println("데이터 추가 기능을 선택하셨습니다.");
				System.out.println();
				System.out.println();
				System.out.println();
				udbc.dbInsert();
			} else if (choice == 4) {
				System.out.println("데이터 수정 기능을 선택하셨습니다.");
				System.out.println();
				System.out.println();
				System.out.println();
				udbc.dbUpdate();
			} else if (choice == 5) {
				System.out.println("데이터 삭제 기능을 선택하셨습니다.");
				System.out.println();
				System.out.println();
				System.out.println();
				udbc.dbDelete();
			} else {
				System.out.println("번호를 잘 누르라구!!");
			}

		}

	}
}
