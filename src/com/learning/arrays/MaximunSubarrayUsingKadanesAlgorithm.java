package com.learning.arrays;

import java.util.Arrays;
import java.util.Collections;

public class MaximunSubarrayUsingKadanesAlgorithm {

	public static void main(String[] args) {
		int nums[] = { -2, 3, 1, -1, 4, 5 };

		int currSum = nums[0], maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currSum = currSum + nums[i];
			if (currSum < nums[i])
				currSum = nums[i];
			if (maxSum < currSum)
				maxSum = currSum;
		}
		System.out.println("maximum sum is" + maxSum);

	}
	
	

}
