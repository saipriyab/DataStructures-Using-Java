package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFrequencyExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		
		System.out.println(Collections.frequency(list,1));

	}

}
