import java.util.Scanner;                      // given in the portal template (keyboard input)
import java.sql.*;                             // JDBC: Connection, Statement, DriverManager, ResultSet

public class j4
{
    public static void main(String args[])
    {
        try
        {
            // ======== GIVEN TEMPLATE (top half on the portal) ========
            Connection conn = null;                    // database connection handle
            Statement stmt = null;                     // object that runs SQL text
            String DB_URL = "jdbc:sqlite:/tempfs/db";  // NPTEL's SQLite database
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL); // open the connection
            stmt = conn.createStatement();              // ready the SQL executor

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();                       // portal's test feeds "2" (used by hidden code)

            // ============ THE ANSWER (the "comment section" on the portal) ============
            // Task: create a table named STUDENTS with the 4 columns from the question:
            //   UID  ->  Integer
            //   Name ->  Varchar(45)
            //   Roll ->  Varchar(12)
            //   Age  ->  Integer
            // executeUpdate() runs CREATE TABLE (DDL). SQLite keeps the declared types;
            // the metadata later reports them as INT / VARCHAR.
            stmt.executeUpdate("CREATE TABLE STUDENTS(UID INTEGER, Name VARCHAR(45), Roll VARCHAR(12), Age INTEGER)");
            // ============ END ANSWER ============

            // Local stand-in for the portal's hidden code: it inspects STUDENTS using
            // DatabaseMetaData and prints each column's name/type plus the column count.
            // Expected (per the test case): "No. of columns : 4" first, then
            // Column 1..4 -> Name/Type pairs. (On the portal the extra "Column 5: Age"
            // duplicate line is just a quirk of their hidden printer, not your SQL.)
            DatabaseMetaData md = conn.getMetaData();   // "describe table" information

            int total = 0;                              // 1st pass: count the columns
            ResultSet rs = md.getColumns(null, null, "STUDENTS", null);
            while (rs.next()) total++;
            rs.close();

            System.out.println("No. of columns : " + total);
            rs = md.getColumns(null, null, "STUDENTS", null);   // 2nd pass: print each column
            while (rs.next())
            {
                int i = rs.getInt("ORDINAL_POSITION");          // position: 1,2,3,4
                System.out.println("Column " + i + " Name: " + rs.getString("COLUMN_NAME"));
                System.out.println("Column " + i + " Type: " + rs.getString("TYPE_NAME"));
            }
            rs.close();

            stmt.close();
            conn.close();
            // NOTE: re-running this file locally prints "table STUDENTS already
            // exists" because the DB file persists — on the portal each test run
            // starts from a fresh database, so the test passes there.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}