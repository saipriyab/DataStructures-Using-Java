package com.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Collections shuffle is opposite to sorting

public class CollectionsShuffle {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//it will automatically add random value
		Collections.shuffle(list);
		list.forEach(System.out::println);
		System.out.println("------");
		
		//adding random value
		Collections.shuffle(list,new Random(2));
		
		list.forEach(System.out::println);
		

	}

}
