import java.util.Scanner;

public class j4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for (int i = 1; i <= 4; i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
