package com.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*in-built functional interface Consumer<T> introduced in Java 8.
		It uses examples to show how the accept() & andThen() methods of the Consumer interface are to be used
		//Consumer’s Function Descriptor is T -> (). 
		 * This means an object of type T is input to the lambda with no return value
		// takes one input argument and return nothing 
*/		
		List<Integer> integerList=Arrays.asList(new Integer(1), 
	                              new Integer(10), new Integer(200),
	                              new Integer(101), new Integer(-10),
	                              new Integer(0));
		Consumer<Integer> consumer= i-> System.out.print("Number::--> " + i + " " );
	    
	    printList(integerList, consumer);
	 }
	 public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
	  for(Integer integer:listOfIntegers){
	    consumer.accept(integer);
	  }
		
		
	}

}
