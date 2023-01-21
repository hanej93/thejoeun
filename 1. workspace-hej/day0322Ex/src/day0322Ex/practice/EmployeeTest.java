package day0322Ex.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class EmployeeTest {

	public static void main(String[] args) {
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
//		Employee emp1 = new Employee("피카츄", 2600, "관리부", "사원");
//		Employee emp2 = new Employee("라이츄", 5000, "관리부", "과장");
//		Employee emp3 = new Employee("파이리", 2800, "연구소", "주임");
//		Employee emp4 = new Employee("리자몽", 6000, "연구소", "부장");
//		Employee emp5 = new Employee("뮤츠", 10000, "영업부", "대표이사");
		
		
// 입력 파라미터
//피카츄 2600 관리부 사원 10000
//라이츄 5000 관리부 과장 10001
//파이리 2800 연구소 주임 10003
//리자몽 6000 연구소 부장 10010
//뮤츠 10000 영업부 대표이사 10020

		
		Scanner sc = new Scanner(System.in);
				
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int salary = sc.nextInt();
			String depart = sc.next();
			String position =sc.next();
			int num = sc.nextInt();
			
			employees.put(num, new Employee(name, salary, depart, position));
			
		}

//		employees.put(10000, emp1);
//		employees.put(10001, emp2);
//		employees.put(10003, emp3);
//		employees.put(10010, emp4);
//		employees.put(10020, emp5);

		
		System.out.println("keySet 사용>>>");
		Set<Integer> empKey = employees.keySet();
		int salaryTot = 0;
		for (Integer id : empKey) {
			System.out.println("이름: " + employees.get(id).getName() + " , 연봉: " + employees.get(id).getSalay());
			System.out.println();
			salaryTot += employees.get(id).getSalay();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Entry 사용>>>");
		for(Entry<Integer, Employee> entEmp : employees.entrySet()) {
			System.out.println("사번: "  + entEmp.getKey());
			System.out.println("이름: " + entEmp.getValue().getName() + " , 연봉: " + entEmp.getValue().getSalay());
			System.out.println("부서: " + entEmp.getValue().getDepartment() + " , 직급: " + entEmp.getValue().getPosition());
			System.out.println();
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("직원의 평균연봉: " + salaryTot / employees.size());

		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("사번: 10003");
		System.out.println(
				"부서: " + employees.get(10003).getDepartment() + " , 직급: " + employees.get(10003).getPosition());

		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("연봉 3000이하>>>");
		for (Integer id : empKey) {
			if (employees.get(id).getSalay() <= 3000) {
				System.out.println("이름: " + employees.get(id).getName() + " , 사번: " + id);
			}
		}
	}

}
