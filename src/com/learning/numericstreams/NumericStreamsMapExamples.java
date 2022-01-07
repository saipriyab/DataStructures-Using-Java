package com.learning.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamsMapExamples {

	public static void main(String[] args) {
		// mapToObj(convert each element of numeric stream to some object)
		IntStream.rangeClosed(1,5).mapToObj((i)->{
			return new Integer(i);
		}).forEach(System.out::println);
		
		//mapToLong(convert numeric stream to Long Stream)
		System.out.println(IntStream.rangeClosed(1,5).mapToLong((i)->{
			return new Long(i);
		}).sum());
		
		//mapToDouble (convert numeric stream to Double Stream)
		System.out.println(IntStream.rangeClosed(1,5).mapToDouble((i)->{
			return new Double(i);
		}).sum());

	}

}
