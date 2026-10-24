   import java.util.Scanner;

    class Student
    {
        String name;
        int roll;

        Student(String name, int roll)
        {
            this.name = name;
            this.roll = roll;
        }
    }

    public class j1
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int roll = sc.nextInt();

            Student s = new Student(name, roll);
  // Added semicolon here

            System.out.println("Student Name: " +
  s.name); // Fixed capitalization and spacing
            System.out.println("Roll Number: " +
  s.roll);  // Fixed capitalization and spacing

            sc.close();
        }
    }
