package com.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorExample {

	public static void main(String[] args) {
		
		List<Employee1> emps = getEmployees();
		
		Comparator<Employee1> comparee = (emp1, emp2) ->{
			return new Integer (emp1.getId()).compareTo(emp2.getId());
		};
		
	//	Collections.sort(emps, comparee);
		
		System.out.println(emps);
	}

	 private static List<Employee1> getEmployees() {
		    List<Employee1> employees = new ArrayList<>();
		    employees.add(new Employee1(5, "George", 28));
		    employees.add(new Employee1(8, "Mike", 35));
		    employees.add(new Employee1(10, "Satish", 40));
		    employees.add(new Employee1(2, "Manish", 25));
		    employees.add(new Employee1(4, "Toney", 22));
		    return employees;
		  }
}
