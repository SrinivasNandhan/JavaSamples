package com.multithreading;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExa {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		
		HashMap<Integer,String> hm1 = hm;
		hm.put(1,"test1");
		hm.put(2,"test1");
		hm.put(1,"test1");
		hm.put(4,"test1");
		hm.put(1,"test1");
		
		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs1 = new HashSet<>();
		hs.add("test");
		hs.add("test");
		hs.add("test");
		hs.add("test");
		hs.add(null);
		
		hs1=hs;
		
		HashSet<String> hs3 = new HashSet<>();
		String s1 = new String("test2");
		String s2 = new String("test2");
		String s3=s1;
		String s4 = "i";
		
		hs3.add(s1);
		hs3.add(s2);
		hs3.add(s3);
		hs3.add(s4);
		
		System.out.println("hs3 size :" + hs3.size());
		
	//	System.out.println("map::" + hm.size());
	//	System.out.println("map::" + hm1.size());
		
	//	System.out.println("set::" + hs1.size());
	//	System.out.println("set::" + hm1.size());
		
		
		String st = new String ("abc");
		String st1 = new String ("abc");
		String st21 ="abc";
		
	}

}
