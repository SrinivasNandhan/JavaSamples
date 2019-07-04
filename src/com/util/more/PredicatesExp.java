package com.util.more;

import java.util.function.Predicate;

public class PredicatesExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Predicates

		Predicates are boolean-valued functions of one argument. The interface contains various default methods
		for composing predicates to complex logical terms (and, or, negate)*/
		String se="hello";
		Predicate<String> predicate = (s) -> se.length() > 0;
		
		System.out.println(predicate.test(se));
		
		System.out.println(predicate.test("foo"));              // true
		System.out.println(predicate.negate().test("foo"));
		
		//Predicate<Boolean> ssd =Objects::nonNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		System.out.println(isEmpty);
		System.out.println(isNotEmpty);
		
	}

}
