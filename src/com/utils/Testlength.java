package com.utils;

public class Testlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Testlength.fixLengthLeftJustify("",8));
	}

	public static String fixLengthLeftJustify(String input, int length) {
		if (input == null)input = " ";
		String output = input;
		if (output.length() > length) output = output.substring(0,length);
		if (output.length() < length) {
			while(output.length() < length) {
				output += " ";
			}
		}
		return output;
	}
}
