import java.sql.*;          // JDBC: Connection, Statement, DriverManager, ResultSet
import java.util.Scanner;   // given in the template (input feeds the hidden checker)

public class j5
{
    public static void main(String args[])
    {
        try
        {
            // ======== GIVEN TEMPLATE (top half on the portal) ========
            Connection conn = null;                     // database connection handle
            Statement stmt = null;                      // object that runs SQL text
            String DB_URL = "jdbc:sqlite:/tempfs/db";   // NPTEL's SQLite database
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL); // open the connection
            stmt = conn.createStatement();              // ready the SQL executor

            // Portal's prefix creates STUDENTS before your code runs (question says the
            // table is "already created"). Locally recreate it — IF NOT EXISTS keeps
            // re-runs friendly:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS STUDENTS(UID INTEGER, Name VARCHAR(45), Roll VARCHAR(12), Age INTEGER)");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();    // portal's test feeds "1" (used by hidden code)

            // ============ THE ANSWER (the "comment section") ============
            // DDL to rename the table: ALTER TABLE <old> RENAME TO <new>;
            String alter = "ALTER TABLE STUDENTS RENAME TO GRADUATES;";
            stmt.executeUpdate(alter);
            // ============ END ANSWER ============

            // Local stand-in for the portal's hidden code: it lists the tables via
            // metadata after the rename and prints the current name. After this
            // program's rename, the table literally IS "GRADUATES".
            DatabaseMetaData md = conn.getMetaData();
            ResultSet rs = md.getTables(null, null, "%", new String[]{"TABLE"});
            while (rs.next())
            {
                String name = rs.getString("TABLE_NAME");
                if (!name.toLowerCase().startsWith("sqlite_"))   // skip SQLite internal tables
                    System.out.println("TABLE NAME = " + name);
            }
            rs.close();

            stmt.close();
            conn.close();
            // NOTE: re-running locally fails at the ALTER ("no such table STUDENTS")
            // because the table is already GRADUATES from the previous run and the src
            // database persists — on the portal every test starts from a fresh DB.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
