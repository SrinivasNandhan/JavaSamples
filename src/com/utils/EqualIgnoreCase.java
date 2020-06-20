/**
 * 
 */
package com.utils;

/**
 * @author snandhanamudi
 *
 */
public class EqualIgnoreCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if ("77".equalsIgnoreCase("77")) { System.out.println("Equal"); }else
		 * System.out.println("Not Equal");
		 */
		String st1 = "ABC";
		String st2 =new String("ABC");
		
		String st3 =st2;
		
		if (st1.equals(st2)) {
			System.out.println("Equal 1 ");
		}else
			System.out.println("Not Equal 1");
		
		if (st1 == st2) {
			System.out.println("Equal 2 ");
		}else
			System.out.println("Not Equal 2 ");
		
		if (st1 == st3) {
			System.out.println("Equal 3 ");
		}else
			System.out.println("Not Equal 3");
			
	}

}
