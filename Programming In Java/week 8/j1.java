public class j1
{
static class MyThread extends Thread
{
@Override
public void run()
{
    System.out.println("Thread Running");
}
}
public static void main(String args[])
{
MyThread t= new MyThread();
t.start();
}
    }
