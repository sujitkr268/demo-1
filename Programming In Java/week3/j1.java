import java.util.Scanner;
public class j1
{
    static int fact(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return fact(n-1)*n;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the number whose factorial needed to be found\n");
       int n=sc.nextInt();
       System.out.println("the factorial ofthe number "+n+" is:"+fact(n));

    }
}
