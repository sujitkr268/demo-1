  import java.util.Scanner;

    public class j3 { // Note: Change

        public static void
  main(String[] args) {
            Scanner sc = new
  Scanner(System.in);

            // Read an integer from the

    int num = sc.nextInt();

            // Nested if-else decision

            if (num >= 0) {
                if (num > 0) {
                    System.out.
  println("Positive Number");
                } else {
                    System.out.
  println("Zero");
                }
            } else {
                System.out.
  println("Negative Number");
            }

            sc.close();
        }
    }
