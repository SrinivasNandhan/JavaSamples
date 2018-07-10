package com.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(5, "mkyong.com2", 1));
        list.add(new Hosting(6, "linode.com", 100000)); // new line
        
      /*  Map<String,Long>	result1	=list.stream().
        						collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(oldValue,newValue)->oldValue));
        System.out.println(result1);
     */   
        //List to Map and then sort &collect
         Map result1=list.stream().
        	sorted(Comparator.comparing(Hosting::getName)) //or compareLong with getWebSites
        	.collect(Collectors.toMap(Hosting::getName, Hosting::getId,(oldValue,newValue)->oldValue,
        		 LinkedHashMap::new //// returns a LinkedHashMap, keep order
        		 				));
         		System.out.println(result1);
        
      /*  Map<Integer, String> result3 = list.stream().collect(
        										Collectors.toMap(x -> x.getId(), x -> x.getName()));
      */  
        
       // System.out.println(result1);
		
	}

}
