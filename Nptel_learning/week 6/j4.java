import java.util.Scanner;

public class j4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        // first number
        int b = sc.nextInt();        // second number
        try
        {
            int result = a / b;          // danger zone: divide first by second
            System.out.println(result);  // happy path: prints the answer
        }
        catch (ArithmeticException e)    // net for the fall: b was zero
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally                          // ALWAYS runs - error or not
        {
            System.out.println("Program Ended");
        }
    }
}
