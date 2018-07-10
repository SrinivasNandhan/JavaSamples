package com.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class FunctionTRExample{
  public static void main(String args[]){
	  
	 /*Functions accept one argument and produce a result. Default methods can be used to
	  *  chain multiple functions together (compose, andThen).*/
   
	 /* As explained earlier, compose() default method combines the current Function 
	  * instance with another one and returns a combined Function instance which applies the two functions 
	  * in sequence with the parameter function to compose() being invoked before the current function.
	  Lets*/
	  Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
   
    List<Employee> employeeList= 
     Arrays.asList(new Employee("Tom Jones", 45), 
      new Employee("Harry Major", 25),
      new Employee("Ethan Hardy", 65),
      new Employee("Nancy Smith", 15),
      new Employee("Deborah Sprightly", 29));
    
    List<String> empNameList=convertEmpListToNamesList(employeeList, funcEmpToString);
    empNameList.forEach(System.out::println);
 }
 public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
  
	 List<String> empNameList=new ArrayList<String>(); 
  
	 for(Employee emp:employeeList){
     empNameList.add(funcEmpToString.apply(emp));
   }
   return empNameList;
  }
}