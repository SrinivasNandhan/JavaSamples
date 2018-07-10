package com.util;

import java.util.*;

public class StringJoinerExp {

	public static void main(String[] args) {

		StringJoiner ss = new StringJoiner("/","-","-");
		String sss ="rao";
		sss ="hello";
		System.out.print(sss);
		
		List<String> ssd= Arrays.asList("Rsd","Hsd","BSdF","GD","TR");
	//	ssd.add("sff");
	//	ssd.add("erew");
		
		String ssr =String.join(" #", ssd);
		
		System.out.println(ssr);

		List<Integer> listWithDuplicates = Arrays.asList(123,323,2323,23232,232,12,12);
 		//List<Integer> listWithDuplicates = List.newArrayList(0, 1, 2, 3, 0, 0);
		List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
		System.out.print(listWithoutDuplicates.size());


	}

}
