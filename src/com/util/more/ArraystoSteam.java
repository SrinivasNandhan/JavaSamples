package com.util.more;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraystoSteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	The Predicate interface represents an operation that takes a single input and returns a boolean value
		//se Arrays.stream or Stream.of to convert an Array into a Stream.
		//In Java 8, Stream cannot be reused, once it is consumed or used, the stream will be closed.
		//IllegalStateException , we if did not close stream.	
		String[] ss = new String[] {"Rao","man","hello","raoga"};
		Stream ssq= Arrays.stream(ss);// 1.convert array to stream -- Arrays.Steam
		//ssq.forEach(x->System.out.println(x));
		ssq.forEach(System.out::println);
		Stream ssm =Stream.of(ss); // 2.convert array to stream
		ssm.forEach(x->System.out.println(x));
		
		 // reuse it to filter again! throws IllegalStateException 
     /*   long count = ssm.filter(x -> "Rao".equals(x)).count();  //java.lang.IllegalStateException: stream has already been operated upon or closed
        System.out.println(count);
	*/	
	}

}
