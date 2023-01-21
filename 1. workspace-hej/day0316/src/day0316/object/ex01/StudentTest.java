package day0316.object.ex01;

public class StudentTest {

	public static void main(String[] args) {
		Student st01 = new Student();
		Student st02 = new Student();
		
		//private 에 직접 접근 x
		//st01.name = "가렌";
		
		// public 메소드(set)를 활용하여 값을 간접적으로 넣어줄 수 있다.
		st01.setName("가렌");
		
//		System.out.println(st01.name);
		
		System.out.println(st01.getName());
		
		
		//어? 오브젝트를 상속했어?
		System.out.println(st01);
		System.out.println();
		System.out.println(Integer.toHexString(st01.hashCode()));
		System.out.println();
		
		//object에 있는 메소드 equals()는
		// 두 객체의 해시코드를 비교하는 메소드이다.
		System.out.println(st02);
		System.out.println(st01.equals(st02));
		System.out.println(st01==st02);
		
		// 해당되는 객체를 문자열로 변경하는 메소드
		String st01Str = st01.toString();
		System.out.println();
		System.out.println("st01.toString(): " + st01Str);
		System.out.println(st01); // 내부적으로 toString을 호출한다.
		
		
	}

}
