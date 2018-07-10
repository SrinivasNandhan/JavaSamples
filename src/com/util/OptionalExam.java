package com.util;

import java.util.Optional;

public class OptionalExam {

	public static void main(String[] args) {
		//		Optional.empty() method is useful to create an empty Optional object
//Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.
//Null checks are not required.		No more NullPointerException at run-time		
		
		Optional<String> gender =Optional.of("MALE");
		String ans="yes";
		String ans1=null;
		
		
		System.out.println(gender.map(String::toLowerCase));
		
	//	System.out.println(gender.isPresent());
	//	System.out.println(Optional.ofNullable(ans1));
	//	Optional<String> gender1=gender.empty();
	//	System.out.println(gender1.isPresent());
		
	}

}
