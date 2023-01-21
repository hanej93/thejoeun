package day0317.abstractEx.ex01;

public class Test {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // 추상 클래스는 객체를 생성할 수 없다.

		Lion lion = new Lion();
		lion.setName("똥개");
		lion.bark();

		Dog dog = new Dog("야옹이");
		dog.bark();

		Chicken chicken = new Chicken();
		chicken.bark();

		System.out.println();
		System.out.println();
		System.out.println();
		// 배열(같은 타입인 애들의 묶음)
		// 서로 다른 타입은 부모로 묶어줄 수 있다.
		// "다형성" : 하나의 자료형이 여러 개의 자료형을 다룰 수 있는 것

		Animal animal1 = new Lion();
		Animal animal2 = new Chicken();
		animal1.bark();
		animal2.bark();

		Animal[] animals = new Animal[3];
		animals[0] = lion;
		animals[1] = dog;
		animals[2] = chicken;
		for (Animal a : animals) {
			a.bark();
		}

		for (int i = 0; i < animals.length; i++) {
			animals[i].bark();
		}
		// 이 메소드는 부모인 Animal에 정의되어있지 않기 때문에 사용할 수없다.
		// animals[2].isFried();

		// 다운캐스팅하여 자식 자료형에 담으면 사용 가능
		Chicken c = (Chicken) animals[2];
		System.out.println(c.isFried());

		// cast 예외가 발생한다.
		// lion을 chicken 으로 바꾸려 해서!
		// Chicken c1 = (Chicken)animals[0];

		// 부모 변수에 들어있는 객체의 실제 타입을 비교하는 키워드
		// instanceof
		if (animals[0] instanceof Chicken) {
			System.out.println(((Chicken) animals[0]).isFried());
		}

	}

}
