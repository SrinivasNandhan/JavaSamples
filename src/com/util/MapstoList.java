package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapstoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> ss= new HashMap<String,String>();
		
		//convert all keys to list
		List<String> keysl = new ArrayList(ss.keySet());
		
		//convert all values to list
		List<String> values1 = new ArrayList(ss.values());
		
		// Java 8, Convert all Map keys to a List n sort
		List<String> ssd=ss.keySet().stream().sorted().
				collect(Collectors.toList()); //or 
		//List<String> ssd1=keysl.stream().collect(Collectors.toList());
		      
		
		
				
	}

}
