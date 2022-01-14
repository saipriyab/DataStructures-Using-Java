package com.learning.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int nums[] = { 2, 11, 5, 10, 7, 8 };
		int start = 0, end = nums.length - 1, temp = 0;
		while (start < end) {
			temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start++;
			end--;
		}
		for (Integer in : nums)
			System.out.print(in + " ");

	}

}
