import java.util.Scanner;

class account
{
    private int balance;
    public void setbalance(int n)
    {
        balance=n;
    }
    public int display()
    {
        return balance;
    }
}

public class j3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        account s=new account();
        s.setbalance(bal);
        System.out.println("Balance is: "+s.display());
    }
}
