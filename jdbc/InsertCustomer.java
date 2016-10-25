//Step 1: Import package
import java.sql.*;
public class InsertCustomer 
{
  public static void main(String[] args)
  {
      Connection con;
      String user="giet";
      String passwd="giet";
      
      try
      {
          //Step 2: Registered the Driver
          String type4="oracle.jdbc.driver.OracleDriver";
          Class.forName(type4);
          //Step 3: Define the connection URL
          String url="jdbc:oracle:thin:@localhost:1521:xe";
          //Step 4: Establish the connection
          con=DriverManager.getConnection(url, user, passwd);
          //Step 5: Create the Statement
          Statement stmt=con.createStatement();
          //Step 6: Execute the Query
          String qry="insert into customer values(1,'ssb','gunupur','9937099370')";
          //Step 7: Process the result
          int a=stmt.executeUpdate(qry);
          if(a>0)
                  System.out.println(a+" Row is Inserted");
          else
              System.out.println("The Data is not inserted");
          
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
}
