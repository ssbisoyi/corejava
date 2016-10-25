//This program connect ot the Oracle database using Typr-4 driver
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleType4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1 Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Thin Driver Loaded");
		// Step 2 Get the connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "giet", "giet");
		System.out.println("Connection Established");
  }
}
