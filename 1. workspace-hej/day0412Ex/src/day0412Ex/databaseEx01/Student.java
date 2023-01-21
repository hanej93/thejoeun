package day0412Ex.databaseEx01;

import java.time.LocalDate;

public class Student {
	int id;
	String name;
	LocalDate birth_date;
	int kor;
	int eng;
	int math;

	public Student(int id, String name, LocalDate birth_date, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.birth_date = birth_date;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth_date=" + birth_date + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + "]";
	}

	public int getId() {
		return id;
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

	public LocalDate getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
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

	public Student() {
		super();
	}

}
