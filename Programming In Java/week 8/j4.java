public class j4
{
    static class MyThread extends Thread
    {
        @Override
        public void run()                         // task the thread performs
        {
            System.out.println("Thread is running");
        }
    }

    public static void main(String args[])
    {
        MyThread t = new MyThread();              // create OUR class, not a plain Thread (type must match)

        // Priority rules: an int between 1 (Thread.MIN_PRIORITY) and 10 (Thread.MAX_PRIORITY).
        // 5 = Thread.NORM_PRIORITY (the default). Valid range -> no exception. Set before start().
        t.setPriority(5);

        t.start();                                // launch: now a real 2nd thread executes run()

        System.out.println("Thread priority is:" + t.getPriority());
    }
}
