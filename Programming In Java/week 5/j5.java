import java.util.Scanner;

public class j5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try
        {
            String s;
            if (n == 1)
            {
                s = null;          // simulate the assignment: input 1 -> a null String
            }
            else
            {
                s = "works";
            }
            System.out.println(s.length());   // DANGER: calling a method on null -> THROWS
            System.out.println("No exception");
        }
        catch (Exception e)               // ONE catch, catches EVERY exception type below
        {
            System.out.println(e);        // prints the exception's full name, e.g. java.lang.NullPointerException
        }
    }
}
