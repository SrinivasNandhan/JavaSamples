package com.util;


public class ThreadDemo  implements Runnable{
public static void main(String srs[]) throws Exception
{
        Thread t = new Thread(new ThreadDemo());
        t.setName("FirstThread");
        t.start();

        Thread t1 = new Thread(new ThreadDemo()); //call run function()
        t1.setName("SecondThread");
        t1.start();
}
    Thread rd;
    @Override
    public void run() {

    for(int i=0;i<4;i++)
    {
        System.out.println(Thread.currentThread().getName()+ " -->" + i);

        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            System.out.print(e);
        }

    }

    }
}
