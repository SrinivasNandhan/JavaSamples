/**
 * 
 */
package com.utils;


/**
 * @author snandhanamudi
 *
 */
public class TestSkip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String detailLine = "";
		int units = 19130;
		String strUnits="";
		for (int i=995;i<1005;i++) {
		 strUnits = new Integer(units).toString();
		}
		
		detailLine += (TestSkip.padLeft(strUnits, '0', 4)); /* was showing as decimal e.g., 27.0 */ // 39 326-329 Units
		
		System.out.println(detailLine.length() + "\n");

		
	}
	
	public static String padLeft(String input, char pad, int length) {
		if (input == null) input = "";
		input = input.trim();
		while (input.length() < length) {
			input = pad + input;
		}
		return input;
	}

}
