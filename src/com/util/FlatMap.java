package com.util;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// convert to string using Flatmap
public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// the Stream operations (filter, sum, distinct…) and collectors do not support it, so, 
		//we need flatMap() to do the following conversion :
		
		//In Java 8, Stream can hold different data types, for examples
		
	//	Stream<String[]>		-> flatMap ->	Stream<String>
	//	Stream<Set<String>>		-> flatMap ->	Stream<String>
	//	Stream<List<String>>	-> flatMap ->	Stream<String>
	//	Stream<List<Object>>	-> flatMap ->	Stream<Object>
	//	{ {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6} flatmap works like this

	//	{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'} this
		String[][] data=new String[][] {{"a","b"},{"c","d"},{"e","f"},{"g","h"}};
		Stream<String[]> temp=Arrays.stream(data);
		Stream<String> stringStream=temp.flatMap(x->Arrays.stream(x));
		//Stream<String> stream=stringStream.filter(x->"a".equals(x.toString()));
		//stringStream.forEach(System.out::print);
		
		 int[] intArray = {1, 2, 3, 4, 5, 6};
		 Stream<int[]> streamArray =Stream.of(intArray);
		// IntStream intstream =streamArray.flatMapToInt(x->Arrays.stream(x));
		// intstream.forEach(System.out::println);
		 
		
	}

}
