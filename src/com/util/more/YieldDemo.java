package com.util.more;

public class YieldDemo {
    public static void main(String sr[])throws Exception {

    MyThread mt = new MyThread();
        mt.setName("mt");
        mt.start();

        MyThread mt1 = new MyThread();
        mt.setName("mt1");
        mt1.start();

         for (int i=0 ; i <5; i++)
         {
            Thread.yield();
             System.out.println(Thread.currentThread().getName()+ " mythread-->" + i);
         }
    }
}

class MyThread extends  Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)   {
            System.out.println(Thread.currentThread().getName()+ " -->" + i);
        }
    }
}