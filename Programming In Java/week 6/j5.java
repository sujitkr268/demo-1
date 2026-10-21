import java.util.Scanner;

public class j5
{
    /*
     ERRORS in my original code:
     1. I declared the method calculatesquareroot() INSIDE the main() method.
        -> Java does NOT allow a method inside another method. It must be a
           separate method inside the class (which is why I got a compiler error).
     2. I had TWO main() methods and TWO "Scanner sc" declarations in the same class.
        -> Only one main() (the entry point) is allowed.
     3. Line: "s      Scanner sc=new Scanner(System.in);" had a stray letter 's'
        typed before Scanner -> syntax error.
     4. I wrote "throw new exception(...)" with a small 'e'.
        -> Java is case-sensitive; the class is "Exception" (capital E).
     5. My braces { } were not matched properly at the end of the class.
        -> Every opening brace must have a matching closing brace.
    */

    // this method THROWS the exception up to the caller (main)
    public static double calculateSquareRoot(double num) throws Exception
    {
        if (num < 0)
        {
            throw new Exception("Number cannot be negative - no real square root.");
        }
        return Math.sqrt(num);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        try
        {
            double result = calculateSquareRoot(number);   // may THROW
            System.out.println("Square root is: " + result);
        }
        catch (Exception e)                                // net for the fall
        {
            System.out.println("The square root cannot be found here.");
        }
        sc.close();
    }
}
