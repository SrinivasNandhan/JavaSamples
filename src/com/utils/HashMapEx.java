package com.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer,String> sss = new HashMap<>();
		
	//	Set<String> ss = new HashSet<>();
		
		sss.put(1, "Test");
		sss.put(2, "Test2");
		sss.put(1, "Test3");
		sss.put(2, "Test4");
		// iterator 
		Iterator ite = sss.entrySet().iterator();
		
		while (ite.hasNext())
		{
			Map.Entry  obj=	(Map.Entry) ite.next();
			
			//System.out.println(obj.getKey() + " :" + obj.getValue());
			
		}
	      //  OR  Using Hashmap.forEach() 
		// Represents an operation that accepts two input arguments and returns noresult

		sss.forEach((k, v) -> System.out.println(k + " : " + (v))); 
        
		Hashtable<Integer,String> sss1 = new Hashtable<>();
		
		sss.put(1, "Test");
		sss.put(1, "Test2");
		sss.put(1, "Test3");
		sss.put(1, "Test4");
		
	//	System.out.println("size: " + sss.size());
		
	//	System.out.println("size: " + sss.size());
	}

}
