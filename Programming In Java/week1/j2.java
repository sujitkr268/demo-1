//wap to prin area and perimeter of a rectangle
import java.util.Scanner;

public class j2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = sc.nextDouble();

        System.out.println("Enter breadth:");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
