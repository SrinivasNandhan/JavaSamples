package com.util;

//Implement Runnable Interface...
class ImplementsRunnable implements Runnable {
    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ImplementsRunnable : Counter : " + counter);
    }
}

//Extend Thread class...
class ExtendsThread extends Thread {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }
}
public class ThreadVsRunnable {
    public static void main(String str[])throws Exception
    {
    ///In the Runnable interface approach, only one instance of a class is being created and it has been shared by different threads
        /*
        *
        * When to use Runnable?
        Use Runnable interface when you want to access the same resource from the group of threads.
        Avoid using Thread class here, because multiple objects creation consumes more memory and it becomes a big performance overhead.
        A class that implements Runnable is not a thread and just a class. For a Runnable to become a Thread,
        You need to create an instance of Thread and passing itself in as the target
        *
        *
        *
        * */
        // Multiple threads share the same object.
      /*  ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.setName("thread1");
        t1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread

        Thread t2 = new Thread(rc);
        t2.setName("thread2");
        t2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread

        Thread t3 = new Thread(rc);
        t3.setName("thread3");
        t3.start();*/

       // Creating new instance for every thread access.
        ExtendsThread tc1 = new ExtendsThread();
        tc1.setName("thread1-Ex");
        tc1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread

        ExtendsThread tc2 = new ExtendsThread();
        tc2.setName("thread2-Ex");
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread

        ExtendsThread tc3 = new ExtendsThread();
        tc3.setName("thread3-Ex");
        tc3.start();

    }
}
