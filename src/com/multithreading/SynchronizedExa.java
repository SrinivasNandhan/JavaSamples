package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchronizedExa {
	
	public static void main(String[] args) throws Exception {
			
		    ExecutorService executor = Executors.newFixedThreadPool(2);

		/*
		 * IntStream.range(0, 10000) .forEach(i -> executor.submit(this::increment));
		 * 
		 * ConcurrentUtils.stop(executor);
		 */
		//    System.out.println(count);  // 9965
		    
		}
	}

