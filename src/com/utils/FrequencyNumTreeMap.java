package com.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyNumTreeMap {

	public static void main(String[] args) {
		int arr[]= {10,7,6,6,7,10,5};
		printFrequency(arr);
	}

	private static void printFrequency(int[] arr) {
		TreeMap<Integer,Integer> hmap = new TreeMap<>();
		for (int i=0; i<arr.length ;i++)
		{
			Integer num= hmap.get(arr[i]);
			System.out.println("num::" + num);
			if (hmap.get(arr[i])==null)
			{
			//	System.out.println("null");
				hmap.put(arr[i],1);
			}else
				hmap.put(arr[i],++num);
		}
		
		for (Map.Entry m: hmap.entrySet())
		{
			System.out.println("Frequency:" +m.getKey() + " is:" + m.getValue());
		}
		
	}

	

}
