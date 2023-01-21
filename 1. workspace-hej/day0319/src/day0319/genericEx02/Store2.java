package day0319.genericEx02;

public class Store2<T, E> {
	private T data1;
	private E data2;

	public T getData1() {
		return data1;
	}

	public E getData2() {
		return data2;
	}

	public void setData1(T data1) {
		this.data1 = data1;
	}

	public void setData2(E data2) {
		this.data2 = data2;
	}

}
