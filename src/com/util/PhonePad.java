package com.util;

//Chars to Numbers
public class PhonePad {

	public static void main(String[] args) {
		
		
		int sfd = 15%3;
		
		System.out.println(sfd); // /=5, % =0
		
		String ph="CAT";
		 String res="";
			
		for (int i=0;i<ph.length();i++) 		{
			
			 char c = ph.charAt(i);
			 
			int po = phoneCharToDigit(c);
			res=res+po;
			
		}
		System.out.println(res);
	}
		public static int phoneCharToDigit (char letter)
	    {
	        letter = Character.toUpperCase(letter);
	        int value = 0;

	        switch(letter) {
	            case 'A':
	            case 'B':
	            case 'C':
	                // Yes, 2, your original code was wrong; there are no letters on 1
	                value = 2;
	                break;

	            case 'D':
	            case 'E':
	            case 'F':
	                value = 3;
	                break;

	            case 'G':
	            case 'H':
	            case 'I':
	                value = 4;
	                break;

	            case 'J':
	            case 'K':
	            case 'L':
	                value = 5;
	                break;

	            case 'M':
	            case 'N':
	            case 'O':
	                value = 6;
	                break;

	            case 'P':
	            case 'Q':
	            case 'R':
	            case 'S':
	                value = 7;
	                break;

	            case 'T':
	            case 'U':
	            case 'V':
	                value = 8;
	                break;

	            case 'W':
	            case 'X':
	            case 'Y':
	            case 'Z':
	                value = 9;
	                break;

	        }
	        return value;
	}

}
