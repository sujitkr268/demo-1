import java.util.Scanner;

class SquareThread extends Thread
{
    private int begin;
    private int end;

    public SquareThread(int begin, int end)
    {
        this.begin=begin;
        this.end=end;
    }

    synchronized public void run()
    {
        if(begin>end)
        {
            for(int i=begin;i>=end;i--)
            {
                System.out.println(i*i);
            }
        }
        else
        {
            for(int i=begin;i<=end;i++)
            {
                System.out.println(i*i);
            }
        }
    }
}

public class j3
{
    public static void main(String args[]) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        int begin=sc.nextInt();
        int end=sc.nextInt();
        sc.close();

        SquareThread thread1=new SquareThread(begin,end);
        SquareThread thread2=new SquareThread(end,begin);

        thread1.start();
        thread1.join();   // wait until thread1 prints everything before thread2 starts
        thread2.start();
        thread2.join();
    }
}
