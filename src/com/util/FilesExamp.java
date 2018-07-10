package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesExamp {

	public static void main(String[] args) {
	//	In Java 8, you can use Files.lines to read file as Stream.
		
	//	Method reference	 	Equivalent lambda expression
	//	String::valueOf			x -> String.valueOf(x)
	//	Object::toString		x -> x.toString()
	//	x::toString				() -> x.toString()
	//	ArrayList::new			() -> new ArrayList<>()
		
		String ss="C://files//read.txt";
		//read file into stream, try-with-resources
		//try(Stream<String> stream=Files.lines(Paths.get(ss))){
			try(BufferedReader br=Files.newBufferedReader(Paths.get(ss))){
		//	br.forEach(System.out::println);
				List<String> dfd=br.lines().collect(Collectors.toList());
				dfd.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
