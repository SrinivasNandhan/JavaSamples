package com.util;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*What is java.util.function.Supplier: Supplier<T> is an in-built functional interface introduced in Java 8 in the java.util.
		 * function package. 
		 Supplier can be used in all contexts where there is no input but an output is expected.
		 T get(); //
		 Supplier’s Function Descriptor is () -> T .
		 Supplier<T> can be used without the need to define a new functional interface every time.
*/		
		//Default methods cannot be accessed from within lambda expressions. The following code does not compile
		//Supplier instance with lambda expression
		//Optionals are not functional interfaces,
/*		 Stream operations are either intermediate or terminal. While terminal operations return a result of a certain type, 
				 intermediate operations return the stream itself so you can chain multiple method calls in a row. Streams are 
						 created on a source, e.g. a java.util.Collection like lists or sets (maps are not supported). 
				 Stream operations can either be executed sequential or parallel.*/
	//	ForEach is a terminal operation. It's void, so we cannot call another stream operation.
		//Sorted is an intermediate operation which returns a sorted view of the stream.
		//The intermediate operation map converts each element into another object via the given function. The following example converts each string into an upper-cased string.
		//But you can also use map to transform each object into another type. The generic type of th
		  Supplier<String> helloStrSupplier = () -> new String("Hello");
		  String helloStr = helloStrSupplier.get();
		  System.out.println("String in helloStr is->"+helloStr+"<-");
		   
		  //Supplier instance using method reference to default constructor
		  Supplier<String> emptyStrSupplier = String::new;
		  String emptyStr = emptyStrSupplier.get();
		  System.out.println("String in emptyStr is->"+emptyStr+"<-");
		   
		  //Supplier instance using method reference to a static method
		  Supplier<Date> dateSupplier= SupplierExp::getSystemDate;
		  Date systemDate = dateSupplier.get();
		  System.out.println("systemDate->" + systemDate);
		 }
		 public static Date getSystemDate() {
		  return new Date();
		 }
	}


