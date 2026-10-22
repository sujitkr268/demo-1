import java.util.Scanner;
public class j5
{
    public static void main(String[] args)
    {
        // Step 1: read the password from the user.
        // next() reads a single word/token, which is enough here
        // because the password contains letters, digits, and special characters
        Scanner sc=new Scanner(System.in);
        String password=sc.next();

        // Step 2: condition 1 — minimum length of 8 characters.
        // This is a direct comparison, so we know the result immediately
        boolean min_Length=password.length()>=8;

        // Step 3: conditions 2 and 3 are unknown yet,
        // so we start with false and switch to true as soon as we FIND one
        boolean has_Uppercase=false;
        boolean has_Number=false;

        // Step 4: scan the password CHARACTER BY CHARACTER
        for(int i=0;i<password.length();i++)
        {
            // pick the character at position i
            char ch=password.charAt(i);

            // Condition 2 - is it an uppercase letter (A-Z)?
            if(Character.isUpperCase(ch))
            {
                has_Uppercase=true;
            }

            // Condition 3 - is it a numeric digit (0-9)?
            if(Character.isDigit(ch))
            {
                has_Number=true;
            }
        }

        // Step 5: the password is valid ONLY if all three conditions
        // are true at the same time (&& = AND),
        // otherwise it is invalid
        if(min_Length && has_Uppercase && has_Number)
        {
            System.out.println("Valid Password");
        }
        else
        {
            System.out.println("Invalid Password");
        }
    }
}
