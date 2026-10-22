public class j2
{
    // =====================================================================
    // EXPLANATION OF THE CONCEPT (for understanding — not part of output)
    //
    // A thread can be created in TWO ways in Java:
    //   1) class MyThread extends Thread            (inheritance)  -> j1
    //   2) class MyRunnable implements Runnable     (composition)  -> this file
    //
    // Runnable is an interface with a SINGLE method: run().
    // It represents just the TASK, while the Thread object is the WORKER.
    //
    // Why is Runnable preferred often?
    //   - Java supports only SINGLE inheritance: if your class already
    //     extends Thread, it can NEVER extend any other class.
    //     Implementing Runnable keeps the "extends" slot free.
    //   - It separates the task (what to do) from the worker (which
    //     thread does it) -> flexible: one Runnable can be given to
    //     many threads or reused elsewhere.
    //
    // Flow used here:
    //   MyRunnable (the task) -> wrapped in a Thread (the worker)
    //   -> start() creates a NEW thread -> JVM calls run() on it
    // =====================================================================

    // The class given in the assignment: implements Runnable,
    // which is a promise that "this object has a run() method"
    static class MyRunnable implements Runnable
    {
        // run() is the ONLY method Runnable demands — this is the
        // code that will execute INSIDE the new thread when started
        @Override
        public void run()
        {
            System.out.println("Runnable thread is running");
        }
    }

    public static void main(String[] args)
    {
        // Step 1: create the Runnable object (the task to be done)
        MyRunnable runnableObj = new MyRunnable();

        // Step 2: hand the task over to a Thread object.
        // The Thread constructor accepts (Runnable target) —
        // this is how the task and the worker get connected
        Thread threadObj = new Thread(runnableObj);

        // Step 3: start() — NOT run()!
        // start() = ask the JVM to REGISTer a brand-new thread,
        // and THAT thread automatically executes runnableObj.run().
        // Calling run() directly would just run it on the main thread
        // and no second thread would ever be created.
        threadObj.start();
    }
}
