package com.steams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {

	 //create list of integers
		List<Integer> number = Arrays.asList(2,3,1,4,5,3,4,2);

		// distinct 
		
		List<Integer> distinctNums = number.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Distinct elements :" + distinctNums);
		
		//demo to map method
		List<Integer> square = number.stream()
									 .map(x->x*x)
									 .collect(Collectors.toList());
		
		System.out.println("Multiply number : " + square); // 
		
		//create list of strings
		
		List<String> names = Arrays.asList("Helo","Sir","Chandana","Navya");
		
		List<String> names1=  names.stream()
		       .filter(i->i.startsWith("C") || i.startsWith("N"))
		       .collect(Collectors.toList());
		 System.out.println("start with char 'C' or 'N' names : " + names1);
		
		 //sorted
		 
		 List<String> sortedNames = names.stream()
				 						 .sorted()
				 						 .collect(Collectors.toList());
		 
		 System.out.println("Sorted names :" + sortedNames);
		 
		 // demonstration of forEach method 
		 
		// number.stream().map(x->x*x).forEach(y->System.out.print(" " + y));
		
		// demonstration of reduce method 
		 
		int even= number.stream().filter(x->x%2==0) //get even number
						.reduce(0,(total,element)->total+element);
		 
		System.out.println("total of even nums : " + even);
	 
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String result = letters
		  .stream()
		  .reduce("", (partialString, element) -> partialString + element);
		
		System.out.println("result:" + result);
		
		int ss =10;  // % module 0 , / =division 5
		
		System.out.println("value :" + (ss%2));
	
	}

}
