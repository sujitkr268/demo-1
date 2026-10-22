class Counter
{
    int count = 0;

    synchronized void increment()      // the lock: only 1 thread inside at a time
    {
        count = count + 1;
    }
}

class MyThread extends Thread
{
    Counter counter;                   // the shared counter this thread works on

    MyThread(Counter counter)
    {
        this.counter = counter;        // BOTH threads receive the SAME object -> sharing
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            counter.increment();
        }
    }
}

public class j5
{
    public static void main(String args[])
    {
        Counter c = new Counter();     // ONE counter, shared by both threads

        MyThread t1 = new MyThread(c); // thread 1 -> same c
        MyThread t2 = new MyThread(c); // thread 2 -> same c

        t1.start();                    // methods need ()
        t2.start();

        try {
            t1.join();                 // wait until thread 1 finishes...
            t2.join();                 // ...AND thread 2 (and: no import needed -
        } catch (InterruptedException e) {   // InterruptedException lives in java.lang)
        }

        System.out.println("Final count: " + c.count);   // 1000 + 1000 = 2000
    }
}
