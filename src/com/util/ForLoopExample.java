package com.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForLoopExample {

	
	public static void main(String[] args) {

	//List<Developer> list1= getDeveloper();
		List<String> list1= getDeveloper();
	list1.stream().parallel().sequential().sorted()
	//.filter(s->s.equals("3"))
	.forEach(System.out::println);
	
	List<String> ss=list1.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(ss);
	//list1.sort((Developer o1,Developer o2)->o1.getAge()-o2.getAge());
	
//	list1.forEach((developer)->System.out.println(developer.getAge()));
	}
	private static List<String> getDeveloper() {
		
	//private static List<Developer> getDeveloper() {
		//List<Developer> result = new ArrayList<Developer>();
		List<String> result = new ArrayList<String>();

		/*result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 1));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
*/
		
		result.add("hai");
		result.add("rao");
		result.add("nan");
	return result;
	}

}
