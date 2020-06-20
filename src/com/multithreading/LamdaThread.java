package com.multithreading;

import java.util.concurrent.TimeUnit;

public class LamdaThread {

	public static void main(String[] args) {
		
		Runnable task = () -> {
			
			 try {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello :" + threadName);
		    
		    System.out.println("Foo " + threadName);
	       
				TimeUnit.SECONDS.sleep(1000);
				 System.out.println("Bar " + threadName);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        
		};

		task.run(); //object's run method to be called in that separately executing thread.
					//the Java Virtual Machinecalls the run method of this thread. 
		
		//Due to concurrent execution we cannot predict if the runnable will be invoked before or after printing 'done'. 
		
		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");
		
	}

}
