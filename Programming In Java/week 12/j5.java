   import java.util.Scanner;

    public class j5 { // Change 'j5' to
  match your class/file name if needed
        public static void
  main(String[] args) {
            Scanner sc = new
  Scanner(System.in);

            // 1. Read size n and
  create the array
            int n = sc.nextInt();
            int[] arr = new int[n];

            // 2. Read n numbers into
  the array
            for (int i = 0; i < n; i++)
  {
                arr[i] = sc.nextInt();
            }

            int positiveSum = 0;
            int negativeCount = 0;

            // 3. Process the array
  elements
            for (int i = 0; i < n; i++)
  {
                if (arr[i] > 0) {
                    positiveSum +=
  arr[i];      // Add positive numbers
                } else if (arr[i] < 0)
  {
                    negativeCount++;
  // Count negative numbers
                }
            }

            // 4. Print both results
            System.out.println("Sum of
  positive numbers: " + positiveSum);
            System.out.println("Count
  of negative numbers: " +
  negativeCount);

            sc.close();
        }
    }
