package com.learning.string;

public class SubsequenceProblem {

	public static void main(String[] args) {
		String str1 = "ade", str2 = "abcdefgh";
		int i = 0, j = 0, f = 0;
		while (i < str1.length() && j < str2.length()) {
			if (str1.charAt(i) == str2.charAt(j)) {
				i++;
			}
			if (i == str1.length()) {
				f = 1;
				break;
			}
			j++;
		}
		if (f == 1)
			System.out.println("subsequence");
		else
			System.out.println("not a subsequence");

	}

}
