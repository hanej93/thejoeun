package day0324.execeptionEx01;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		
		// 배열과 관련된 예외
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		System.out.println(Arrays.toString(nums));
		
	}
}
