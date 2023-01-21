package day0319.genericEx02;

public class StoreTest {
	public static void main(String[] args) {

		// <Integer> 이 store는 Integer만 담을 수 있는 객체로 사용하겠다!
		Store<Integer> store = new Store<Integer>();

		store.setData(new Integer(100));

		
		// 컴파일하면서 여기가 잘못됐는지 확인이 가능!
//		String str = (String) store.getData();
		
		System.out.println(store.getData());
	}
}
