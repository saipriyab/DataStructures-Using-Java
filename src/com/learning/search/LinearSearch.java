package com.learning.search;

public class LinearSearch {

	public static void main(String[] args) {
		int nums[] = { 1, 4, 5, 3, 2 };
		int target = 3, f = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				f = 1;
				System.out.println("element found at " + target);
				break;
			}
		}
		if (f == 0)
			System.out.println("-1");

	}

}
