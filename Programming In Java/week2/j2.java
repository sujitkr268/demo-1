import java.util.Scanner;

public class j2

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        int length = sc.nextInt();

        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();

        int perimeter = 2 * (length + breadth);

        System.out.println("Perimeter = " + perimeter);
    }
}
