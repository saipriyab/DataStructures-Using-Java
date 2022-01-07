package com.learning.collections;

import java.util.Collections;
import java.util.TreeMap;

public class ReverseOrderOfTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(1, "hello");
		map.put(2, "welcome");
		map.put(3, "to");
		map.put(4, "learning");

		map.forEach((k, v) -> {
			
			
			System.out.println(k + " " + v);
		});

	}

}
