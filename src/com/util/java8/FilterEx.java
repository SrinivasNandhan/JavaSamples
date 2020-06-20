/**
 * 
 */
package com.util.java8;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author snandhanamudi
 *
 */
public class FilterEx {

	public static void main(String[] args) {
		
	Map<Integer,String> map = new HashMap<>();
	
	map.put(1, "hello");
	map.put(2, "hello1");
	map.put(3, "hello");
	map.put(4, "hello12");
	
	String res = map.entrySet().stream()
			     .filter(x->"hello".equalsIgnoreCase(x.getValue()))
			     .map(x->x.getValue())
			     .collect(Collectors.joining());
	System.out.println("res :" + res);
	
	String res1 = map.entrySet().stream()
		     .filter(x->1 == x.getKey())
		     .map(x->x.getKey().toString())
		     .collect(Collectors.joining());
	
	System.out.println("res1 :" + res1);
	
	String res2 = map.entrySet().stream()
		     .filter(x->1 == x.getKey())
		     .map(x->x.getValue())
		     .collect(Collectors.joining());
	
	System.out.println("res2 :" +  res2);
	
	
	Map<Integer,String> dates = new HashMap<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
	String todayDate = sdf.format(new Date());
	
	dates.put(1, todayDate);
	dates.put(2, todayDate);
	dates.put(3, todayDate);

	String res4 = dates.entrySet().stream()
			       .filter(x -> x.getValue().equalsIgnoreCase("190731"))
			       .map(x-> x.getValue())
			       .collect(Collectors.joining());
	
	String res5 = dates.entrySet().stream()
		       .filter(x -> Integer.parseInt(x.getValue()) >190731)
		       .map(x-> x.getValue())
		       .collect(Collectors.joining());
	
	
	System.out.println(res4);
	System.out.println(res5);
	
	List mylist = Arrays.asList("London", "Paris", "NewYork");
    String joined = String.join("||", mylist);
    System.out.println("Joined String : " + joined);

    
    HashMap<String,String> ss =new HashMap<>();
    
    ss.put("1", "as");
    ss.put("1", "as1");
    ss.put("1", "as2");
    ss.put("1", "as3");
    
    System.out.println("map size:" +ss.size());

    String a = "Rama";

    if(a == "Rama")
    {
    	 System.out.println("In If");
    }
    else
    {
    	 System.out.println("In else");
    }
	
	
	
	}
}
