package day0316.ex01;

public class User {
	private String name, userId, password;
	private int point;
	

	public User(String name, String userId, String password, int point) {
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.point = point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		String str = "사용자의 이름 : " + name;
		str += "\n사용자의 아이디: " + userId + " , 비번: " + password + " , 가용 포인트: " + point;
		return str;
	}
	
}
