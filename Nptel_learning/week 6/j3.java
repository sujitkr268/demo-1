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
            int result = a / b;          // danger zone
            System.out.println(result);  // happy path: the division result
        }
        catch (ArithmeticException e)    // net for the fall: division by zero
        {
            System.out.println("Exception caught: Division by zero.");
        }
        finally                          // ALWAYS runs - error or not!
        {
            System.out.println("Program End");
        }
    }
}
