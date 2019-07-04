package com.utils;

import java.util.HashMap;
import java.util.Map;

public class FrequencyNumber {

	public static void main(String[] args) {
		int arr[]= {10,7,6,6,7,10,5};
		printFrequency(arr);
	}

	private static void printFrequency(int[] arr) {
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for (int i=0; i<arr.length ;i++)
		{
			Integer num= hmap.get(arr[i]);
			if (hmap.get(arr[i])==null)
			{
				System.out.println("null");
				hmap.put(arr[i],1);
			}else
				hmap.put(arr[i],++num);
		}
		
		for (Map.Entry m: hmap.entrySet())
		{
			System.out.println("Frequency:" +m.getKey() + " is:" + m.getValue());
		}
		
	}

/*	num::null
	num::null
	num::null
	num::1
	num::1
	num::1
	num::null
	Frequency:5 is:1
	Frequency:6 is:2
	Frequency:7 is:2
	Frequency:10 is:2*/

}
