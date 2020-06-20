package com.testdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MergeNames {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		ArrayList<String> arrayList = new ArrayList(Arrays.asList(names1));
		
		arrayList.addAll(Arrays.asList(names2));
		
		LinkedHashSet<String> dupele = new LinkedHashSet(arrayList);
		
		String[] finalArra = new String[dupele.size()];
		
		dupele.toArray(finalArra);
		
		return finalArra;

		// throw new UnsupportedOperationException("Waiting to be implemented.");
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };

		System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}

}
