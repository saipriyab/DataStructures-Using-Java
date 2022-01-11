package com.learning.soring;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 5, 3, 1, 2, 4 };

		boolean isSwapped = false;
		int i = 0, j = 0, temp = 0;
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
		for (i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

}
