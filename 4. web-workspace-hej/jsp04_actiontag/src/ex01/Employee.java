package ex01;

import java.time.LocalDate;

public class Employee {
	private String name;
	private int salary;
	private String position;
	private LocalDate birth;
	
	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public Employee() {
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", position=" + position + "]";
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
