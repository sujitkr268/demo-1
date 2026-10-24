
import java.util.Scanner;

class Calculator {
    // Method 1: adds two numbers
(needs opening { and closing })
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three numbers
(must be INSIDE Calculator class)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class j2 {
    public static void main(String
args[]) {
        Scanner sc = new
Scanner(System.in);
        Calculator calc = new
Calculator();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        // Used 'calc' (not 'cal')
and exact expected text
        System.out.println("Sum of
two numbers: " + calc.add(a, b));
        System.out.println("Sum of
three numbers: " + calc.add(c, d, e));

        sc.close();
    }
}
