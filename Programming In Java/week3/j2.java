import java.util.Scanner;
class cls1
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    }
    class cls2 extends cls1
    {
        void calculate(int a,int b)
        {
            add(a,b);
            System.out.println(a*b);
            System.out.println(a*a+b*b);
        }
    }
    public class j2
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            cls2 obj=new cls2();
            obj.calculate(a,b);
        }
    }
