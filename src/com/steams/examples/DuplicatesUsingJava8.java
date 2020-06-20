package com.steams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesUsingJava8 {

	public static void main(String[] args) {
 
		String[] str = {"ABC","ABC","TEST","TEST","BCB","SS"};
		
		Arrays.sort(str);
		
		int length =str.length-1;
		
		int count =0;
		
		for (int i= 0 ;i < length ;i++)
		{
			
				//if (str[i].equals(suffix) == str[i])
				{
					
					count++;
					
				}
			
		}
		
		System.out.println(count);
		
		List<String> sr = Arrays.asList(str);
		
		List<String> sss =sr.stream().distinct().collect(Collectors.toList());
		
		System.out.println(sss);
		
	}

}
