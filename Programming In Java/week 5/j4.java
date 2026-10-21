import java.util.Scanner;
import java.util.InputMismatchException;

public class j4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                    // how many numbers are coming
        int[] arr = new int[n];                  // make n empty boxes
        try
        {
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();           // may THROW if input is not an integer!
            }
        }
        catch (InputMismatchException e)         // safety net catches the throw
        {
            System.out.println("You entered bad data.");
            return;                              // stop here - do NOT print a sum
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
