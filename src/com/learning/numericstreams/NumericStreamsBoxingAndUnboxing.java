package com.learning.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsBoxingAndUnboxing {

	public static void main(String[] args) {

		// boxing(wrapper to primtive type)
		IntStream.range(1, 5).boxed().forEach(System.out::println);
		
		//unboxing(primtive to wrapper type)
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());

	}

}
