import java.util.Scanner;
class student
{
    int rollno;
    Scanner sc=new Scanner(System.in);
    student()
    {
        System.out.println("Enter the roll no");
        rollno=sc.nextInt();
    }
}
public class j1
{
    public static void main(String args[])
    {
        student s=new student();
        System.out.println("the roll no is:\n");
        System.out.println(s.rollno);
    }
}
