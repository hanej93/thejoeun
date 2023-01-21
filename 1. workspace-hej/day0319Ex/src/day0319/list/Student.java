package day0319.list;

public class Student {

	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int age, int kor, int eng, int math) {
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	@Override
	public String toString() {
		String str = "\n\n\n\n학생 정보\n";
		str += "이름: " + name + " , 나이: " + age;
		str += "\n성적\n";
		str += "국어성적: " + kor + " , 영어성적: " + eng + " , 수학성적: " + math;
		return str;
	}

}
