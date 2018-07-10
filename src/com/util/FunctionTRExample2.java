package com.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class FunctionTRExample2 {
	
  public static void main(String args[]){
	  
	 /*Functions accept one argument and produce a result. Default methods can be used to
	  *  chain multiple functions together (compose, andThen).*/
   
	 /* As explained earlier, compose() default method combines the current Function 
	  * instance with another one and returns a combined Function instance which applies the two functions 
	  * in sequence with the parameter function to compose() being invoked before the current function.
	  Lets*/
	  /*when an object of a type is taken as input and it is converted(or mapped) to another type.
	  Common usage of Function is in streams where-in the map function of a stream accepts an instance of Function to convert the stream of one type to a stream of another type.
*/		    
	//  Function<T, R>’s Function Descriptor is T -> R. This means an object of type T is input to the lambda and an object of type R is obtained as return value
	  
	//   compose  --> used for combile functions , used of before functions
	   
	//   AndThen -- >used for combile functions , used of AFTER functions
	  
	//  In Java 8, functions became first class. Therefore, you can take functions as arguments of other functions, return functions and store functions as objects.
	   //Storing a function in an Object  java.util.Function<T, R> Interface was introduced
	  //BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
	  //BiFunction Interface in java.util to represent a function with two arguments and one return object.
	//  Map object to object
//	  The function.apply method will apply this function to a given arguement. 
	  //In this case, the function.apply will convert the Person object to a Job object.
	  //Job job = mapPersonToJob.apply(person);
	  
	  Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
		    Function<Employee, Employee> funcEmpFirstName= 
		     (Employee e)-> {int index= e.getName().indexOf(" ");
		                 String firstName=e.getName().substring(0,index);
		                 e.setName(firstName);
		                 return e;};
		    List<Employee> employeeList=
		      Arrays.asList(new Employee("Tom Jones", 45), 
		       new Employee("Harry Major", 25),
		       new Employee("Ethan Hardy", 65),
		       new Employee("Nancy Smith", 15),
		       new Employee("Deborah Sprightly", 29));
		    List<String> empFirstNameList= convertEmpListToNamesList(employeeList,funcEmpToString.compose(funcEmpFirstName));
		    empFirstNameList.forEach(str->{System.out.print(" "+str);});
		  }
		 public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
		   List<String> empNameList=new ArrayList<String>(); 
		   for(Employee emp:employeeList){
			   System.out.println(emp.getName());
		     empNameList.add(funcEmpToString.apply(emp));
		   }
		   return empNameList;
		  }
		}