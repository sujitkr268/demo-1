import java.util.Scanner;
interface find
{
int sqr(int x);
}
class A implements find
{
    public int sqr(int y)
    {
        return y*y;
    }
}
public class j1
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers\n");
    int b=sc.nextInt();
     A f=new a();
    System.out.println("the result is ;\n"+f.sqr(b));
}
}
