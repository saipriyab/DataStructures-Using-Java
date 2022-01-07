package com.learning.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

	public static void main(String[] args) {
		
		System.out.println(IntStream.range(1,50).count());//include 1 to 49
		System.out.println(IntStream.rangeClosed(1,50).count());//include 1 to 50
		
		System.out.println(LongStream.range(1,50).count());//include 1 to 49
		System.out.println(LongStream.rangeClosed(1,50).count());//include 1 to 50
		
		//DoubleStream doesn't support ranghe & rangeClosed
		System.out.println(IntStream.range(1,50).asDoubleStream().count());
		IntStream.rangeClosed(1,5).asDoubleStream().forEach(System.out::println);

	}

}
