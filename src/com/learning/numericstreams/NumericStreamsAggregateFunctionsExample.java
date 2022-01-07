package com.learning.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateFunctionsExample {

	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 5).sum());

		OptionalInt max = IntStream.range(1, 5).max();
		if (max.isPresent())
			System.out.println("sum is" + max.getAsInt());
		
		OptionalLong min= LongStream.range(1, 5).min();
		if (min.isPresent())
			System.out.println("sum is" + min.getAsLong());
		
		OptionalDouble avg= IntStream.range(1, 5).average();
		if (avg.isPresent())
			System.out.println("sum is" + avg.getAsDouble());

	}

}
