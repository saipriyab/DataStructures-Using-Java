package com.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//user to reverse arraylist,linkedlist and array
public class CollectionsReverseExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("d");
		list1.add("c");

		Collections.reverse(list1);

		System.out.println(list1);

		List<String> list2 = new LinkedList<>();
		list2.add("a");
		list2.add("d");
		list2.add("c");

		Collections.reverse(list2);

		System.out.println(list2);

		int arr[] = { 1, 2, 3 };
		
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
	
	}

}
