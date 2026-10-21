import java.util.Scanner;

public class j2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();                  // step 1: read the two integers
        int b = sc.nextInt();

        try                                    // OUTER safety net - the whole house
        {

            try                                // INNER safety net - just the kitchen (the division)
            {
                int result = a / b;            // danger zone: b == 0 throws ArithmeticException
                System.out.println(result);    // happy path: shows the division result
            }
            catch (ArithmeticException e)      // INNER catch: handles ONLY division by zero
            {
                System.out.println("Division by zero caught!");
            }
        }
        catch (Exception e)                    // OUTER catch: anything unexpected from anywhere inside
        {
            System.out.println("Some other unexpected error occurred.");
        }
        sc.close();
    }
}
