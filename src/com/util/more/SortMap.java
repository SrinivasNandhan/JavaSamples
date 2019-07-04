package com.util.more;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> items =
                Arrays.asList("apple", "apple", "banana","apple", "orange", "banana",null, "papaya" ,null);
		List<String> res=items.stream()
				.filter(s->s!=null).collect(Collectors.toList()); //use filter to avoid null

		/*Map<String, Long> res=items.stream()
									.filter(s->x!=null).collect(Collectors.toList());
		*/							// .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("res::" + res);
		
		/*Map<String,Long> fmap = new LinkedHashMap<>();
		
		res.entrySet().stream()
					  .sorted(Map.Entry.<String,Long>comparingByValue()
					   .reversed()).forEachOrdered(e->fmap.put(e.getKey(),e.getValue()));	*/
		
		System.out.println(res);
	}

}
