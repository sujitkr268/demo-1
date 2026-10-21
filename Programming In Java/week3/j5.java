import java.util.Scanner;
public class j5
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                System.out.printf("%d\n",i);
            }
        }
    }
}
