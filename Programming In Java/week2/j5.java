class Circle
{
    int radius;
    Circle(int radius)
    {
        this.radius=radius;

    }
}
public class j5
{
    public static void main(String args[])
    {
        Circle c=new Circle(5);
        System.out.println("The radius of the circle is "+c.radius);
    }
}
