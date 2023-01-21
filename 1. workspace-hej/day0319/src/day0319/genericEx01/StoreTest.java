package day0319.genericEx01;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

		store.setData("하하하");
		store.setData(new Integer(100)); //100이라는 글자가 들어감
		
		// 데이터의 자료형이 예상한 것과 달라 오류를 발생시킬 가능성이 높아진다.
		String str = (String) store.getData();
		
		
		
	}
}
