import java.util.Scanner;
public class j3
{
    static boolean isPrime(int n){
if(n<=1)
return false;
for (int i=2;i*i<=n;i++)
{
  if(n%i==0)
  return false;

} return true;
    }
    static int primeSum(int x,int y)
    {
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int sum=0;
for (int i=min;i<=max;i++)
{
if(isPrime(i))
{
    sum=sum+i;
}
} return sum;

    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
   System.out.println("The sum of prime numbers is: " + primeSum(x, y));
    }
}
