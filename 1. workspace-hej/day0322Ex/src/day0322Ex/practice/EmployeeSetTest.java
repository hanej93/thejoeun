package day0322Ex.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeSetTest {

	public static void main(String[] args) {
		
		Set<Employee> empSet = new HashSet<>();
		
		Employee emp1 = new Employee("피카츄", 2600, "관리부", "사원");
		Employee emp2 = new Employee("라이츄", 5000, "관리부", "과장");
		Employee emp3 = new Employee("파이리", 2800, "연구소", "주임");
		Employee emp4 = new Employee("리자몽", 6000, "연구소", "부장");
		Employee emp5 = new Employee("뮤츠", 10000, "영업부", "대표이사");
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		Iterator<Employee> empIt = empSet.iterator();
		while(empIt.hasNext()) {
			Employee temp = empIt.next();
			System.out.println("이름: " + temp.getName() + " , 연봉: " + temp.getSalay());
			System.out.println("부서: " + temp.getDepartment() + " , 직급: " + temp.getPosition());
			System.out.println();
			System.out.println();
		}
		
		
	}
}
