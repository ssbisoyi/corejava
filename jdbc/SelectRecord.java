import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1 Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Thin Driver Loaded");
		// Step 2 Get the connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "giet", "giet");
		System.out.println("Connection Established");
		//Step 3 create s statement to send the SQL statement to the database
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from student");
		System.out.println("=======================================================================");
		System.out.println("Roll No\t\tName\t\tBranch\t\tSemester");
		System.out.println("=======================================================================");
		while(res.next()){
			System.out.println(res.getString(1)+"\t\t"+res.getString(2)+"\t\t"+res.getString(3)+"\t\t"+res.getString(4));
		}
	}

}
