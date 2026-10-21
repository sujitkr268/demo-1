import java.util.Scanner;

class j5
{
    public void add(int a, int b)
    {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    private void add(int a, int b, int c)
    {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Calculator cal = new Calculator();
        cal.add(a, b);        // public overload → 2-arg version runs
        cal.add(a, b, c);     // private overload → legal: main is inside the same class
    }
}
