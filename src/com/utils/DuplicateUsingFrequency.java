package com.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsingFrequency {

	public static void main(String[] args) {

		
		  // Initial stream 
        List<Integer> list 
            = Arrays.asList(5, 13, 4, 
                            21, 13, 27, 
                            2, 59, 59, 34); 
  
        // Print the found duplicate elements 
        System.out.println( 
            findDuplicateInStream(list)); 
	}

	private static <T> Set<T>  findDuplicateInStream(List<T> list) {
	
		return list.stream() // Count the frequency of each element 
                // and filter the elements 
                // with frequency > 1 
				.filter(i->Collections.frequency(list,i )>1)
				.collect(Collectors.toSet());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
