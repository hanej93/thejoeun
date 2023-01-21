package day0322Ex.practice;

public class Employee {
	private String name;
	private int salay;
	private String department;
	private String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Employee(String name, int salay, String department, String position) {
		super();
		this.name = name;
		this.salay = salay;
		this.department = department;
		this.position = position;
	}
	
	
}
