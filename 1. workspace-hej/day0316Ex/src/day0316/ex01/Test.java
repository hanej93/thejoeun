package day0316.ex01;

public class Test {
	
	public static void main(String[] args) {
		
		Phone[] phoneArr = new Phone[3];
		Phone phone1 = new Phone("애플", 950000, "아이폰");
		Phone phone2 = new Phone("삼성", 800000, "갤럭시");
		Phone phone3 = new Phone("엘지", 770000, "지프로");
		
		phoneArr[0] = phone1;
		phoneArr[1] = phone2;
		phoneArr[2] = phone3;
		
		Person[] personArr = new Person[3];
		Person person1 = new Person("홍길동", 30);
		Person person2 = new Person("이몽룡", 33);
		Person person3 = new Person("성춘향", 35);
		
		personArr[0] =person1;
		personArr[1] =person2;
		personArr[2] =person3;
		
		person1.setPhone(phone1);
		person2.setPhone(phone2);
		person3.setPhone(phone3);
		
		int priceTot = 0;
		int maxPrice =0;
		Person maxPricePerson = null;
		
		for (int i = 0; i < personArr.length; i++) {
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println(personArr[i].getName() +"이 갖고 있는 폰의 단말기는 " + 
		personArr[i].getPhone().getPhoneName() + "입니다.");
			
			
			System.out.println(personArr[i].getName() +"의 폰의 가격은 " +
					personArr[i].getPhone().getPrice() +"원 입니다.");

			priceTot += personArr[i].getPhone().getPrice();
			
			if(maxPrice <personArr[i].getPhone().getPrice() ) {
				maxPrice = personArr[i].getPhone().getPrice();
				maxPricePerson = personArr[i];
			}
			
			System.out.println();
			System.out.println("사용자 정보");
			System.out.println("-----------------");
			System.out.println(personArr[i]);
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n==============================================\n");
		
		
		System.out.println("각 사람의 폰 평균가: " + (double)priceTot/3 + "원");
		System.out.println("가장 비싼 폰 가진 사람 이름: " + maxPricePerson.getName() + " , 나이: " + maxPricePerson.getAge());
		
		
	}
	
	
	
	
	
}
