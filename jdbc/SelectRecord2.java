/Step-1 import the package
import java.sql.*;
class SelectRecord2{
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//Step 2: Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3: Create and established the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","giet","giet");
		System.out.println("Connected to the database");
		//Step 4: Create the Statement for the select operetion
		Statement stmt=con.createStatement();
		//Step 5: Execute the statement
		ResultSet rs=stmt.executeQuery("select * from student");
		System.out.println("The Student details are");
		System.out.println("======================================");
		while(rs.next()){
			System.out.println("Roll No. is: "+rs.getString(1));
			System.out.println("Name is: "+rs.getString(2));
			System.out.println("Branch is: "+rs.getString(3));
			System.out.println("Semester is: "+rs.getString(4));
			System.out.println("----------------------------");
		}
	}
}
