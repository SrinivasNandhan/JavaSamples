package com.utils;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "ABC";
	String str1 = new String("ABC");
	
	String str2 = str1.intern();
	
	
	if (str.equalsIgnoreCase(str1))
	{
		System.out.println("true");
		
	}else {
		System.out.println("false");
	
	}
	
//  equals
	if (str.equalsIgnoreCase(str2))
	{
		System.out.println("true2");
		
	}else {
		System.out.println("false2");
	
	}
	
	//  ==
	if (str == str1)
	{
		System.out.println("true3");
		
	}else {
		System.out.println("false3");
	
	}
	
//  ==
	if (str == str2)
	{
		System.out.println("true4");
		
	}else {
		System.out.println("false4");
	
	}
	
}
}
