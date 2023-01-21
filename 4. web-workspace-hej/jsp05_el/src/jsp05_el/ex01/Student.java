package jsp05_el.ex01;

import java.time.LocalDate;

public class Student {
	private String name;
	private Score score;
	private LocalDate birth;


	public Student() {}

	public Student(String name, Score score, LocalDate birth) {
		this.name = name;
		this.score = score;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birth=" + birth + "]";
	}
	
	
}
