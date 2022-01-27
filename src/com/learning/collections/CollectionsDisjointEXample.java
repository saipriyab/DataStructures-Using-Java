package com.learning.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDisjointEXample {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10, 20, 30, 40);  
         List<Integer> list2 = Arrays.asList(10, 20, 30, 4, 5, 6); 
         //true if nothing is common,false if something is in common
         System.out.println(Collections.disjoint(list, list2));  

	}

}
