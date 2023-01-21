package day0324.execeptionEx01;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			System.out.println("여기는 실행이 될까?");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과하였습니다!!");
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	
}
