package com.utils;

public class MacOccChar {
	
	static final int ASCII_SIZE=256;
	public static void main(String[] args) {
		
		String str = "hellosir";
		getMaxOccurence(str);
		
	}

	private static void getMaxOccurence(String str) {

		int count[] = new int[ASCII_SIZE];
		
		int len = str.length();
		for (int i=0;i<len;i++)
			count[str.charAt(i)]++;
		
		int max =-1;
		char result =' ';
		
		
			
			
			
			
			
			
			
		
	}

}
