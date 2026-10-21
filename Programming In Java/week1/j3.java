import java.util.Scanner;

public class j3
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        System.out.println("Enter height:");
        double height = sc.nextDouble();

        double volume = 3.14159 * radius * radius * height;

        System.out.println("Volume = " + volume);
    }
}
