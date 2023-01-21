package emp;

import java.time.LocalDateTime;

public class Employee {
	private int id;
	private String name;
	private String userId;
	private String password;
	private int salary;
	private LocalDateTime hireDate;
	public int getId() {
		return id;
	}
	public Employee(int id, String name, String userId, String password, int salary, LocalDateTime hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.salary = salary;
		this.hireDate = hireDate;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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

	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", salary=" + salary + ", hireDate="
				+ hireDate + "]";
	}
	
	
}
