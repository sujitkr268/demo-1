import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j4
{
    public static void main(String args[])
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        try
        {
            String number=br.readLine();
            int x=Integer.parseInt(number);
            System.out.print(x*x);
        }
        catch(Exception e)
        {
            System.out.print("Please enter valid data");
        }
    }
}
