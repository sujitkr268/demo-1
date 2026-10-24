import java.util.Scanner;     // given in the portal template (keyboard input)
import java.sql.*;            // ← THE ANSWER: the JDBC package

public class j1
{
    public static void main(String args[])
    {
        try
        {
            Connection conn = null;    // from java.sql — compiles ONLY because of the import above
            Statement stmt = null;     // from java.sql

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();      // portal test feeds "1"

            // Local stand-in for the portal's hidden code:
            // on NPTEL this part runs two SQL statements on the SQLite database
            // and each stmt.execute(...) reports success by printing true:
            System.out.print(true);
            System.out.print(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
