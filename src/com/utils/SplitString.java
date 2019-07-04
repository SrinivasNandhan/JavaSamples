package com.utils;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "837_421571782_336091129_20190530_100843_T_001.txt";
		//			  837_421571782_336091129_20190530_100843_T_001.txt_

		String[] words = str.split("\\_");
		StringBuilder sb = new StringBuilder();
		for (String string : words) {

			if (string.equals("336091129")) {
				string = "33609102812313";

			}
			sb.append(string).append("_");
			
		}
		
		System.out.println(sb.toString());
		String ss =sb.substring(0, sb.length()-1);
		System.out.println(ss);
		String detail ="336091129_ sfafsaf_234243_";
		if (detail.contains("336091129"))
		{
			
			detail =detail.replace("336091129", "336091028");
			System.out.println(detail);
		}
		
		
		//System.out.println(Integer.toString( (1 > 0) ? 4 : 0));
		String ss1=Integer.toString(0);
		System.out.println(ss1);
		
		List<String> ssss = new ArrayList<String>();
		
		ssss =null;
	//	String sss =Integer.toString(ssss.size());
	//	System.out.println(sss);
	}

}
