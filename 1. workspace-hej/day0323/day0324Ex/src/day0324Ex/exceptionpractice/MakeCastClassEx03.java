package day0324Ex.exceptionpractice;

public class MakeCastClassEx03 {
	public static void main(String[] args) {
		Object o = new String();
		
		try {
			Integer i = (Integer)o;
		} catch (ClassCastException e) {
			System.out.println("클래스를 형변환 할 수 없습니다!");
		}
		
	}
}
