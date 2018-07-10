package com.util;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ss = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		IntSummaryStatistics insr= ss.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("Highest number in List : " + insr.getMax());
		System.out.println("Lowest number in List : " + insr.getMin());
		System.out.println("Sum of all numbers : " + insr.getSum());
		System.out.println("Average of all numbers : " + insr.getAverage());

		
	}

}
