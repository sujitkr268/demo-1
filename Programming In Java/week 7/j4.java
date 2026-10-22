import java.util.Scanner;
class PrintNum implements Runnable
{
    private int start;
    private int end;

    PrintNum(int start,int end)
    {
        this.start=start;
        this.end=end;
    }

    public void run()
    {
        for(int i=start;i<=end;i+=2)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

public class j4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int evenStart=sc.nextInt();
        int evenEnd=sc.nextInt();
        int oddStart=sc.nextInt();
        int oddEnd=sc.nextInt();

        Thread EventThread=new Thread(new PrintNum(evenStart,evenEnd),"EventThread");
        Thread OddThread=new Thread(new PrintNum(oddStart,oddEnd),"OddThread");

        EventThread.start();
        try{
            EventThread.join();
        }
        catch(InterruptedException e)
        {}

        OddThread.start();
        try{
            OddThread.join();
        }
        catch(InterruptedException e)
        {}
    }
}
