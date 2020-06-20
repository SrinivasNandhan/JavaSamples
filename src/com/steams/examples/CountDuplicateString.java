package com.steams.examples;

import java.util.HashSet;

public class CountDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String arr[] = { "geeks", "for", "geeks" }; 
		    int n = arr.length; 
		  
		    System.out.println(insertNames(arr, n)); 
		    
	}

	private static int insertNames(String[] arr, int n) {
		// TODO Auto-generated method stub
		
		// To store the names  of the employees 
		int count=0;
	    HashSet<String> set = new HashSet<String>(); 
	    for (int i = 0; i < n; i++)  
	    { 
	  
	        // If current name is appearing 
	        // for the first time 
	        if (!set.contains(arr[i])) 
	        { 
	            set.add(arr[i]); 
	            count++;
	        } 
	      
	    } 
	    return count;
	}

}
