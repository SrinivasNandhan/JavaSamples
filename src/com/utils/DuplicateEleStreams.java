package com.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateEleStreams {

	public static void main(String[] args) {
		// 1. use Set
	Stream<Integer>  stream = Stream.of(5, 13, 4, 21, 13, 27,2, 59, 59, 34);
	
	Stream<Integer>  streamtop = Stream.of(5, 13, 4, 21, 13, 27,2, 59, 59, 34);
	//// Limit - return new stream of n elements
	
	streamtop.sorted().limit(3).forEach((n)->System.out.println(n));
	
//	System.out.println("top n elements :" +stream.sorted().limit(3));
	
	Stream<String>  stream1 = Stream.of("Test1","Test3","Test1","Test2","Test2");
	
	Stream<Integer>  stream21 = Stream.of(1,2,3,4,5,6,7,1,2,3);
		
	// Print the found duplicate elements 
    System.out.println("duplicates::" + findDuplicateInStream(stream1)); 
   // System.out.println("duplicates::" + findDuplicateInStream(stream21)); 
    
    System.out.println("duplicates12::" + stream21.distinct().collect(Collectors.toList())); 
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

	//get list of unique squares
	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//	System.out.println(squaresList.toString());
	
	List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd"," ", " ");

	//get count of empty string
	long count = strings.stream().filter(string -> string.isEmpty() || string.matches(" ")).count();
	
//	System.out.println("count: " +count);
		
	}
	private static <T> Set<T>  findDuplicateInStream(Stream<T> stream1) {
		Set<T> items = new HashSet<>();
		return stream1.filter(n-> !items.add(n))
					 .collect(Collectors.toSet());
	}
	
	
	
}
