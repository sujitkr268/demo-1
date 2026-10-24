public class j2
{
    public static void main(String args[])

    {
        String url="jdbc:sqlite:test.db";
        if(url.equals("jdbc:sqlite:test.db"))
        {
            System.out.println("Connection successful");
        }
        else
        {System.out.println("failed\n");}
    }
}
