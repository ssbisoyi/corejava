//This program use the type-1 driver to connect to the Oracle database
import java.sql.*;
public class OracleType1 
{
    public static void main(String[] args)
    {
       String url="jdbc:odbc:oragiet";
        try
        {
        //Step 1 register Driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Oracle Type 1 Driver Registered");
        //step 2: Open Connection
         Connection con=DriverManager.getConnection(url, "giet", "giet");
        System.out.println("Connection Established");
        }
        catch(Exception e)
        {
            System.out.println("Driver not found or Nuable to load Driver");
        }
    }
}
