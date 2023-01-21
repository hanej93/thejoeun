package day0316.object.ex02;

public class myTest {

	public static void main(String[] args) {
		Phone p1 = new Phone("애플", 1000000);
		Phone p2 = new Phone("삼성", 1200000);

		// 두 폰의 브랜드와 가격을 출력

		System.out.println("브랜드: " + p1.getBrand());
		System.out.println("소비자 가격: " + p1.getPrice() + " 원");

		System.out.println("---------------------------");

		System.out.println("브랜드: " + p2.getBrand());
		System.out.println("소비자 가격: " + p2.getPrice() + " 원");

		System.out.println();
		System.out.println();
		System.out.println();

		// toString을 쓴다면?
		System.out.println(p1);
		System.out.println("---------------------------");
		System.out.println(p2);

		// person 객체를 생성
		Person person1 = new Person("박진출", 50);
		Person person2 = new Person("손승연", 30);

		// 진출에게 갤럭시를 주자
		person1.setPhone(p2);

		// 승연에게 아이폰을 주자
		person2.setPhone(p1);
		
		// 누가 어떤 폰을 갖고 있는지 출력하시오!
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("누가 어떤 폰을 갖고 있는지 출력하시오!\n");
		System.out.println(person1.getName()+"이 " + person1.getPhone().getBrand() + "폰을 갖고 있습니다.");
		System.out.println(person2.getName()+"이 " + person2.getPhone().getBrand() + "폰을 갖고 있습니다.");

		
	}

}
