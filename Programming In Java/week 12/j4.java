
import java.util.Scanner;

public class j4 {
    public static void main(String
args[]) {
        Scanner sc = new
Scanner(System.in); // Added
semicolon
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++
) {
            sum += i;
        }

        System.out.println("Sum is:
" + sum); // Added space after colon
        sc.close();
    }
}
