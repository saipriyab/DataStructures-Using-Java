package com.learning.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to calculate the factorial");
		int n = s.nextInt();
		System.out.println(calculateFactorial(n));

	}

	private static int calculateFactorial(int n) {
		if (n == 1)
			return 1;
		return n * calculateFactorial(n - 1);
	}

}
