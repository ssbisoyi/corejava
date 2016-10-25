package org.ssb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String id;
		String name;
		String branch;
		String semester;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","giet","giet");
		Statement stmt=con.createStatement();
		System.out.println("Enter the Roll no, Name, Branch, Semester");
		do{
		id=sc.next();
		name=sc.next();
		branch=sc.next();
		semester=sc.next();
		int row=stmt.executeUpdate("insert into student values('"+id+"','"+name+"','"+branch+"','"+semester+"')");
		System.out.println(row+" no. of record has been inserted into student table");
		stmt.close();
		System.out.println("Enter Y to continue else N");
		}while((sc.next()).equals("Y"));
		
	}

}
