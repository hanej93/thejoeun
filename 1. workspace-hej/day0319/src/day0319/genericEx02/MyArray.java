package day0319.genericEx02;

public class MyArray<T> {
	private T[] arr;

	public MyArray() {
		// 배열은 object로 먼저 생성 후 형변환 하는 방법으로 만들어야 한다.
		arr = (T[]) new Object[10];
	}

	// 원하는 인덱스에 데이터를 추가할 수 있도록 구현
	public void add(T t, int index) {
		if (index < arr.length && index >= 0) {
			arr[index] = t;
		} else {
			System.out.println(index + "는 배열의 크기를 벗어나 추가되지 않습니다.");
		}

	}
}
