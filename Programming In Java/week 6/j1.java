import java.util.Scanner;
public class j1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try{
            int result=n1/n2;
System.out.println("the result is :\n"+result);
        }
catch(ArithmeticException e)
{
    System.out.println("sorry output\n");
}
sc.close();
    }
}
