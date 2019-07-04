package com.utils;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Testampersand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aText = "test & yes";
		 final StringBuilder result = new StringBuilder();
	     final StringCharacterIterator iterator = new StringCharacterIterator(aText);
	     char character =  iterator.current();
	     while (character != CharacterIterator.DONE ){
	       if (character == '&') {
	         result.append("&amp;");
	      }
	     } 
	     System.out.println(result.toString());
	}

}
