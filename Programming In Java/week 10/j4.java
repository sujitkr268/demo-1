public class j4
{
    public static void main(String args[])
    {
        String sql="SELECT * FROM students;";
        if(sql.equals("SELECT * FROM students;"))
        {
            System.out.println("select statement ready");
        }
        else
        {
            System.out.println("incorrect statement");
        }
    }
}
