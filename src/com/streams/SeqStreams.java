package com.streams;

import java.util.stream.Stream;
//sequential streams
public class SeqStreams {

	public static void main(String[] args) {
		getStream();
		
	}

	private static void getStream() {

		//The Stream.of() and Arrays.stream() are two commonly used methods for creating a sequential stream from a specified array.
		//Both these methods returns a Stream when called with a non-primitive type T 
		
		Stream<Integer> distinctStreams=Stream.of(1,2,4,2,4,7,2,4,6,8,2,6).sorted().distinct();
		
		// Unpredictable order in parallel streams
		Stream<Integer> parallelstream1=Stream.of(1,2,4,2,4,7,2,4,6,8,2,6).sorted().distinct().parallel(); //unpreditable order
		
		distinctStreams.forEach(p->System.out.print(p.longValue() + " "));
		
		System.out.print("\n parallel streams order::");
		
		parallelstream1.forEach(p->System.out.print(p.longValue() + " "));
	
	}

}
