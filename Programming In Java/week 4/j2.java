import java.util.Scanner;
class car
{
    int s;
}
public class j2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("'Enter the valueof speed\n");
        int n=sc.nextInt();
        car speed=new car();
        speed.s=n;
        System.out.println("the speed of car is :\n"+speed.s);
    }
}
