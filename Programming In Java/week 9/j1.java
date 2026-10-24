import java.util.Scanner;
public class j1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[5][5];

        for(int i=0;i<5;i++)
        {
            String line=sc.nextLine();
            for(int j=0;j<5;j++)
            {
                char ch=line.charAt(j);
                if(ch=='0'|| ch=='1')
                {
                    arr[i][j]=Character.getNumericValue(ch);
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=1-arr[i][j];   // flip: 0->1 and 1->0
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
