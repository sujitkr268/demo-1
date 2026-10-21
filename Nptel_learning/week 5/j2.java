import java.util.Scanner;
public class j2
{
    static int findGCD(int n1,int n2)      // ✅ CORRECTED: added 'static' (so main can call it) + renamed to findGCD (assignment's exact name)
    // int findgcd(int n1,int n2)          // ❌ WRONG: no 'static' -> "non-static method cannot be referenced from static context"; name mismatched assignment's findGCD
    {
        if(n1<0 || n2<0)
        {
            return -1;
        }
        if(n2==0)
        {
            return n1;
        }
        else
        {
            return findGCD(n2,n1%n2);      // ✅ CORRECTED: recursive call renamed to findGCD to match
            // return findgcd(n2,n1%n2);    // ❌ WRONG: old lowercase name
        }
    }                                      // ✅ CORRECTED: ADDED this brace — it closes findGCD's body
    // } was MISSING here before main      // ❌ WRONG: missing brace caused "illegal start of expression"
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the two numbers\n:");   // ❌ commented out: prompt text breaks NPTEL's exact-match output (expected shows ONLY the number)
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(findGCD(a,b));  // ✅ CORRECTED: prints the bare value only
        // System.out.println("the resut is :\n"+findgcd(a,b));  // ❌ WRONG: label + typo "resut" + \n -> would FAIL the test case ("the resut is :\n10" != "10")
    }
}
