package mySpring.ex01;

public class MySpringBean {
	private String str1;
	private String str2;
	private int num1;
	public MySpringBean(String str1, String str2, int num1) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		this.num1 = num1;
	}
	public MySpringBean() {
		super();
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	@Override
	public String toString() {
		return "MySpringBean [str1=" + str1 + ", str2=" + str2 + ", num1=" + num1 + "]";
	}
	
	

}
