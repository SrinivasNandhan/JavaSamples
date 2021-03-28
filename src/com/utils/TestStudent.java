package com.utils;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> lstStudents = loadFromDB();

		for(Student s : lstStudents){

		 System.out.println(s.getName().length());

		}
	}

	private static List<Student> loadFromDB() {
		
		List<Student> st = new ArrayList<>();
		st.add(new Student("test"));
		st.add(new Student("test1"));
		st.add(new Student("test2"));
		return st;
	}

}
