package com.streams;

import java.util.stream.IntStream;

public class FilterExample {

	public static void main(String[] args) {

		countPrimeNumbers();

	}

	private static void countPrimeNumbers() { //

		final long count = IntStream.range(1, 50).parallel().filter(number -> isPrime(number)).count();
		System.out.println("Prime number ()1-50  :"  + count);

	}

	private static boolean isPrime(final int number) {

		System.out.println("test::" +Math.sqrt(number)); 
		
		return number > 1
				&& IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(divisor -> number % divisor == 0);

	}

}
