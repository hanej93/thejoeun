package day0322Ex.practice;

import java.util.ArrayList;

public class EmployeeListTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("피카츄", 2600, "관리부", "사원");
		Employee emp2 = new Employee("라이츄", 5000, "관리부", "과장");
		Employee emp3 = new Employee("파이리", 2800, "연구소", "주임");
		Employee emp4 = new Employee("리자몽", 6000, "연구소", "부장");
		Employee emp5 = new Employee("뮤츠", 10000, "영업부", "대표이사");
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		for (int i = 0; i < empList.size(); i++) {
			System.out.println("이름: " + empList.get(i).getName() + " , 연봉: " + empList.get(i).getSalay());
			System.out.println("부서: " + empList.get(i).getDepartment() + " , 직급: " + empList.get(i).getPosition());
			System.out.println();
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	
}
