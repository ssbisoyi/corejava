//This program use the prepare statement to insert the record in to the student table
import java.sql.*;
import java.util.*;
class PSInsert{
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","giet","giet");
		int roll;
		String name;
		String branch;
		String sem;
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
		do{
			System.out.println("Enter the roll, name, branch,semester");
			roll=sc.nextInt();
			name=sc.next();
			branch=sc.next();
			sem=sc.next();
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setString(3,branch);
			ps.setString(4,sem);
			ps.executeUpdate();
			System.out.println("Press y to continue else other to stop");
		}while((sc.next()).equals("y"));
		System.out.println("Record Inserted");
		ps.close();
	}
}
