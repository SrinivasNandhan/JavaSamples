package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExa {

	
	public static void main(String[] args) {
		
		Callable<Integer> task = () -> {
		    try {
		        TimeUnit.SECONDS.sleep(2);
		        return 1231233333;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Integer> future = executor.submit(task);//wait for result until task completes

		System.out.println("future done? " + future.isDone()); // T/F

		Integer result;
		try {
			result = future.get(); //will block and wait until the underlying callable has been terminated
			
			System.out.println("future done? " + future.isDone());
			System.out.print("result: " + result);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
