package com.multithreading;

class MyThread extends Thread
{
	
	public void run()
	{
		
		for (int i=0; i<5 ; i++) 
            System.out.println(Thread.currentThread().getName() 
                                + " in control MyThread:" + i); 
	}
}
public class YieldDemo {

	public static void main(String[] args) {

		MyThread myt = new MyThread();
		
		myt.start();
		
		for (int i =0; i< 5; i++)
		{
// Control passes to child thread ,Thread scheduler checks that priority or similar of thread
			Thread.yield();
			
	// After execution of child Thread 
            // main thread takes over 
            System.out.println(Thread.currentThread().getName() 
                                + " in control Main ():" +i); 
		}
	}

}
