package com.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysAsList {

	public static void main(String[] args) {
		
		String[] arrays= new String[] {"Rao","Nan","Cha","GAR"};
		
		//Stream ssdf= Arrays.stream(arrays); //create stream
		//Stream ssdf= Stream.of(arrays);  //  create stream
		// OR List<String> lists= Arrays.asList("Rao","Nan","Cha");
		List<String> lists= Arrays.asList(arrays); // from arrays to List 
		
		Optional<String> firstElement = lists.stream().findFirst();
		
	//	System.out.println(firstElement.get());
		//Object[] ol = lists.toArray();
	//	Optional<String> lists1= lists.stream().findFirst(); //Return first element using optioanl
	//	System.out.println(lists1.toString());
		
		List<String> listss =lists.stream()
				 				  	//convert list to stream
								  .filter(i-> !"Nan".equals(i))
								  .collect(Collectors.toList());//collect output and converts stream to list
								//.filter(i-> "Rao".equals(i.getName()))
								// .findAny()
								//  .orElse(null); return null if nothing find
			listss.forEach(System.out::println);
		
			/*List<String> sstring=lists.stream()
								      .map(sstring)
		for (String s:lists)
		{
			System.out.println(s);
		}*/
		
	}

}
