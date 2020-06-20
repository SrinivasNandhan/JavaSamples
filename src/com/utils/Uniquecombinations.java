
/*
Given a set of candidate numbers (candidates) (without duplicates) 
and a target number (target), find all unique combinations in candidates 
where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited 
number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
*/

package com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uniquecombinations {

	public static void main(String[] args) {
	//	int[] candidates = { 2, 3, 6, 7 };int target = 7, start = 0;
		
		int[] candidates = { 2, 3,5,6 }; int target = 8, start = 0;
		
		// use helper method so as not to use HashSet
		Arrays.sort(candidates);
		List<List<Integer>> sum = helper(candidates, target, start);

		for (int i = 0; i < sum.size(); i++) {
			
			for (int j = 0; j < sum.get(i).size(); j++) {
				
				System.out.print(sum.get(i).get(j) + " ");
			}
			System.out.println();
			System.out.println("TEST");
		}
	}

	private static List<List<Integer>> helper(int[] candidates, int target, int start) {

		ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();

		for (int i = start; i < candidates.length; i++) {

			if (target - candidates[i] < 0) // 8 - 2 < 0
			{
				break;
			}

			if (candidates[i] == target) // 2 == 8
			{
				ArrayList<Integer> indi = new ArrayList<>();
				indi.add(target);
				results.add(indi);
			} else {
				List<List<Integer>> current = helper(candidates, target - candidates[i], i);
				for (List curr : current) {
					curr.add(candidates[i]);
				}
				results.addAll(current);
			}

		}
		return results;
	}

}
