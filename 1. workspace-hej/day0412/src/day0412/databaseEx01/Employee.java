package day0412.databaseEx01;

import java.time.LocalDateTime;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary, LocalDateTime hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public Employee() {
		
	}
	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDateTime getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}

	

	private LocalDateTime hireDate;
}
