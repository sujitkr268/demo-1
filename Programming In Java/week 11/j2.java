import java.util.Scanner;
import java.sql.*;            // JDBC box: Connection, Statement, DriverManager

public class j2
{
    public static void main(String args[])
    {
        try
        {
            Connection conn = null;                     // MUST be named "conn" (rule 1)
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // ============ THE ANSWER ============
            conn = DriverManager.getConnection(DB_URL); // open the connection
            System.out.print(conn.isValid(1));          // rule 2: timeout must be 1
            // ============ END ANSWER ============

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();                       // portal's test feeds "7" (used by hidden code)

            // Local stand-in for the portal's hidden code:
            // on NPTEL its second check prints the second boolean (false)
            System.out.print(false);

            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
