package day0319Ex;

public class MyArray<T> {
	private T[] arr;

	public MyArray() {
		arr = (T[]) new Object[0];
	}

	public void add(T t) {
		T[] temp = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < temp.length - 1; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length - 1] = t;
		arr = temp;

	}

	public T pop() {

		T lastValue = arr[arr.length - 1];

		T[] temp = (T[]) new Object[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}

		arr = temp;

		return lastValue;

	}

	public T get(int index) {
		return arr[index];
	}

	public int getArrLength() {
		return arr.length;
	}
}
