package com.testdemo;

import java.util.stream.*;
import java.util.*;

public class TestResults 
{
    public static class Student {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        public int getScore() {
            return score;
        }
        
        public String getName() {
            return name;
        }
    }
    
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
    	
    	List<String> fnal = new ArrayList<>();
    	
    	List<Student> names = students
    			.filter(n-> n.getScore()>passingScore)
                .collect(Collectors.toList());
    	
    	for (Student s : names) 
    		fnal.add(s.getName());
    	
		return fnal;
    	
    }
    
 public static void studentsThatPassAverage(Stream<Student> students) {
    	
	 List<Student> stu = students.collect(Collectors.toList());
	 
    	Double average = stu.stream()
    			.collect(Collectors.averagingInt(s->s.score)); 
    	System.out.println("Average : " +average);
    }
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);    
        
        studentsThatPassAverage(students.stream());    
    }


    
}
