package com.steams.examples;

public class ThrowExam {

	public static void main(String[] args) {
	//	try {

			int s = 5 / 0;
			throw new ArithmeticException("dividing a number by 5 is not allowed in this program");
		 /*catch (ArithmeticException e) {
			System.out.println("AR");
		} catch (Exception e) {
			System.out.println("AR1");
		}*/

	}

}
