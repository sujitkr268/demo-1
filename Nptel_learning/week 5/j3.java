import java.util.Scanner;

public class j3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            int result = a / b;      // danger zone: division. If b is 0 -> Java THROWS ArithmeticException
            System.out.println(result);
        }
        catch (ArithmeticException e)    // safety net for the throw above
        {
            System.out.println("Exception caught: Division by zero.");
        }
    }
}
