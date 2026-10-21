import java.util.Scanner;

class Employee
{
    protected int salary;          // Task 1: protected variable salary
}

class Manager extends Employee     // Task 2: subclass inherits from Employee
{
    // salary is inherited automatically — no need to redeclare it
}

public class j4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Manager m = new Manager();     // Task 3: object of Manager
        m.salary = s;                  // protected → usable here (same package & subclass right)
        System.out.println("Salary is: " + m.salary);
    }
}
