package com.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaptoString {

	
	public static void main(String[] args) {

	List<Developer> list1= getDeveloper();
	
	String name=list1.stream()
					 .filter(x->"jason1".equals(x.getName()))
			         .map(Developer::getName)
			         .findAny()
			         .orElse("hellotest");
	System.out.println("name--->" +name);
	
	//If the stream is parallel, and the Collector is concurrent, and either the stream is unordered or
	//the collector is unordered, then a concurrent reduction will be performed (see Collector for details on 
	//concurrent reduction.) 


	List<String> items =Arrays.asList("apple","apple","banana","grape","orange");
	
	Map<String,Long> frutis= items.stream()
			 						  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(frutis);
	//List<Developer> ssd=list1.stream().map(String::toUpperCase).

	}
		
	private static List<Developer> getDeveloper() {
	List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 1));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		
		
	return result;
	}

}
