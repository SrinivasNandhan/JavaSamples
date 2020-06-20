/**
 * 
 */
package com.util;

/**
 * @author snandhanamudi
 *
 */
public class SubStringEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Welcome to geeksforgeeksttttttttttttttttwytttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";
		
		int strrr = str1.length();
		
		if (strrr >400) {
		 System.out.println(str1.substring(0,399)); 
		}else
		{
			System.out.println(str1);
		}
		
		// Initializing String 
        String Str = new String("Welcome to geeksforgeeksttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"); 
  
        // using substring() to extract substring 
        // returns geeksforgeeks 
        System.out.print("The extracted substring is : "); 
      //  System.out.println(Str.substring(0,399)); 
	}

}
