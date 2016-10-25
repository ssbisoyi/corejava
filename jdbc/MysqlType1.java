mport java.sql.Connection;
import java.sql.DriverManager;
public class MysqlType1 
{
    public static void main(String[] args)
    {
        String url="jdbc:odbc:Mysqlgiet";
        try
        {
        //Step 1 register Driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("MySql Type 1 Driver Registered");
        //step 2: Open Connection
        Connection con=DriverManager.getConnection(url, "root", "root");
        System.out.println("Connection Established");
        }
        catch(Exception e)
        {
            System.out.println("Driver not found or Nuable to load Driver");
        }
    }
}
