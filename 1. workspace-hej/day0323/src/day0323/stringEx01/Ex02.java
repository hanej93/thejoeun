package day0323.stringEx01;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// String 에는 여러가지 메서드를 갖고있음
		// 대/소 문자 변경

		// 대문자 변경
		String alpha = "abdefg";
		System.out.println(alpha.toUpperCase());

		// 소문자 변경
		alpha = "AbCdEfG";
		System.out.println(alpha.toLowerCase());

		// 특수 번째만 대/소 문자 변경
		char[] sArr = alpha.toCharArray();
		System.out.println(Arrays.toString(sArr));

		String result = "";

		// .charAt(인덱스) : 문자열 인덱스로 char형으로 불러옴
		if (alpha.charAt(0) <= 'z' && alpha.charAt(0) >= 'a') {

			// .replaceFirst -> 첫번째 문자를 바꿔줌
			result = alpha.replaceFirst(alpha.charAt(0) + "", ((char) alpha.charAt(0) - 32) + "");
		}
		System.out.println(result);

		// 문자열 자르기
		String str1 = "hello world, welcome to my house";
		// .subString: n번째 문자열부터 끝까지 or n~m 까지 출력가능
		System.out.println(str1.substring(13));
		System.out.println(str1.substring(13, 20));

	}
}
