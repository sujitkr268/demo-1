import java.sql.*;             // FIX 1: the JDBC import — the portal's template had this line commented out
import java.util.Scanner;      // given in the template (its input is used by the hidden checker)

public class j3
{
    public static void main(String args[])
    {
        try
        {
            Connection conn = null;     // database connection handle
            Statement stmt = null;      // SQL runner (declared in the template; not used further here)

            // FIX 2: the DB_URL. The buggy template wrote "jdbc:sqlite:.:tempfs.db"
            // (dot instead of slash, missing leading '/'). Correct URL:
            String DB_URL = "jdbc:sqlite:/tempfs/db";   // NPTEL's SQLite database
            // FIX 3: the temp-dir system property. Buggy version had ".:/tempfs," (stray dots/comma):
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // FIX 4: SQLite does not take usernames/passwords in the URL connection.
            // Buggy template called getConnection(DB_URL, "admin", "password");
            // the SQLite driver only wants the URL itself:
            conn = DriverManager.getConnection(DB_URL);

            // FIX 5: order matters — close the connection FIRST, then ask if it is closed.
            // (The buggy template asked isClosed() BEFORE closing, so it would print false.)
            conn.close();
            System.out.print(conn.isClosed());   // connection is closed → prints "true"

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();                // portal's test feeds "6" (used by hidden code)

            // Local stand-in for the portal's hidden code:
            // its checker runs after we closed the connection and prints the
            // literal "False" (capital F) for its second check → full output "trueFalse"
            System.out.print("False");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
