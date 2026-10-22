// =====================================================================
// THREAD STATES (for understanding — this comment block is not output)
//
// A thread in Java moves through STATES, like a person on a mission:
//   starts in one state -> works -> finishes (dead).
//
// The 3 simple states asked in this assignment:
//   NEW        -> object created with `new`, but start() NOT called yet.
//                 It exists, but no work is happening and no 2nd
//                 thread exists — it is only a normal object so far.
//   RUNNABLE   -> after start() is called, a REAL second thread now
//                 exists and does/tries to do its work. (Java calls
//                 the "running" state RUNNABLE.)
//   TERMINATED -> run() has finished. The thread is DEAD — its state
//                 can never change again (start() on it is illegal).
//
// How do we READ a thread's state? -> thread.getState()
// How do we make main WAIT?        -> thread.join()
//   main pauses inside join() and comes back ONLY when the child
//   thread has completely died — that is why, right after join(),
//   the state is guaranteed TERMINATED.
//
// The 5-line story this program tells:
//   create object  ->  print state (NEW)
//   start()        ->  print state (RUNNABLE), child prints its line
//   join()         ->  main sleeps while child finishes
//   after join()   ->  print state (TERMINATED)
// =====================================================================

class MyThread extends Thread
{
    // The task the thread will perform — runs INSIDE the child thread
    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}

public class j3
{
    public static void main(String args[])
    {
        // Step 1: create the thread object.
        // Right now it is only an OBJECT — no second thread exists yet
        MyThread thread = new MyThread();

        // Step 2: read the state BEFORE starting -> must be NEW,
        // because start() has not been called
        System.out.println("Thread state before start: " + thread.getState());

        // Step 3: start() — the real launcher.
        // It asks the JVM to create a SECOND thread, which executes run().
        // This is the state-change moment: NEW -> RUNNABLE.
        // (Calling run() directly would NOT create a thread at all!)
        thread.start();

        // Step 4: right after launching, the thread is active ->
        // so the state is RUNNABLE. (Note: this line and the child's
        // "Thread is running" line come from two DIFFERENT threads,
        // so occasionally they can swap order.)
        System.out.println("Thread state after start: " + thread.getState());

        // Step 5: join() = "main, WAIT here".
        // The main thread pauses and returns only when the child
        // thread's run() is completely over. This forces a
        // deterministic, ordered output.
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            // thrown only if main's waiting is interrupted; nothing to do here
        }

        // Step 6: join() returned, so the child is definitely
        // finished -> its state is TERMINATED (a dead thread)
        System.out.println("Thread state after completion: " + thread.getState());
    }
}
