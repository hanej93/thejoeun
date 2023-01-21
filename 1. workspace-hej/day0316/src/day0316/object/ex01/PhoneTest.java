package day0316.object.ex01;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone1 = new Phone("아이폰");
		Phone phone2 = new Phone("갤럭시");

		Person person = new Person();
	
		phone1.call();
		phone2.call();
		
		System.out.println();
		System.out.println();
		
		person.doCall(phone1);
		person.doCall(phone2);
		
		
	}

}
