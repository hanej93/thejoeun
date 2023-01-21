package day0319.list;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> stuArr = new ArrayList<>();

		stuArr.add(new Student("피카츄", (int) (Math.random() * 30) + 1, (int) (Math.random() * 101),
				(int) (Math.random() * 101), (int) (Math.random() * 101)));
		stuArr.add(new Student("파이리", (int) (Math.random() * 30) + 1, (int) (Math.random() * 101),
				(int) (Math.random() * 101), (int) (Math.random() * 101)));
		stuArr.add(new Student("꼬북이", (int) (Math.random() * 30) + 1, (int) (Math.random() * 101),
				(int) (Math.random() * 101), (int) (Math.random() * 101)));
		stuArr.add(new Student("이상해씨", (int) (Math.random() * 30) + 1, (int) (Math.random() * 101),
				(int) (Math.random() * 101), (int) (Math.random() * 101)));
		stuArr.add(new Student("토게피", (int) (Math.random() * 30) + 1, (int) (Math.random() * 101),
				(int) (Math.random() * 101), (int) (Math.random() * 101)));

		System.out.println(stuArr);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.println("전교생 이름 / 나이");
		for (int i = 0; i < stuArr.size(); i++) {
			System.out.println("이름: " + stuArr.get(i).getName() + " , 나이: " + stuArr.get(i).getAge());
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		int mathSum = 0;
		int korSum = 0;
		int engSum = 0;
		for (int i = 0; i < stuArr.size(); i++) {
			mathSum += stuArr.get(i).getMath();
			korSum += stuArr.get(i).getKor();
			engSum += stuArr.get(i).getEng();
		}
		
		System.out.println("전교생 평균 점수");
		System.out.printf("수학평균: %.1f\n" , (double)mathSum/stuArr.size());
		System.out.printf("국어평균: %.1f\n" , (double)korSum/stuArr.size());
		System.out.printf("영어평균: %.1f\n" , (double)engSum/stuArr.size());

	}

}
