import java.util.Scanner;

class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double distance(Point p2)
    {
        double d1=this.x-p2.x;
        double d2=this.y-p2.y;
        return Math.sqrt(d1*d1+d2*d2);
    }
}

public class j5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        sc.close();

        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);

        System.out.print(p1.distance(p2));
    }
}
