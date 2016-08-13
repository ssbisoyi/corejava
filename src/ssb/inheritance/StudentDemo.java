package ssb.inheritance;

import java.util.Scanner;
class Project{
	int pid;
	String pname;
	Scanner sc=new Scanner(System.in);
	void projInput(){
		System.out.println("Enter the project details:");
		pid=sc.nextInt();
		pname=sc.next();
	}
}
class Student extends Project{
	int roll;
	String name;
	Scanner sc=new Scanner(System.in);
	void studentInput(){
		System.out.println("Enter the name and roll of the student");
		name=sc.next();
		roll=sc.nextInt();
	}
	void display(){
		System.out.println("ROLL NO."+"\tSTUDENT NAME"+"\tPID"+"\tPROJECT NAME");
		System.out.println("==================================================");
		System.out.println(roll+"\t"+name+"\t"+"\t"+pid+"\t"+pname);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		Student st=new Student();
		st.projInput();
		st.studentInput();
		st.display();

	}

}
