package com.learning.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static void main(String[] args) {
		 List<Integer> list=Arrays.asList(1,2,3,4,5);
		 System.out.println(list.stream().reduce(0,(x,y)->x+y)); //unboxing to convert integer to int
		 
		 System.out.println(IntStream.rangeClosed(1,5).sum());

	}

}
