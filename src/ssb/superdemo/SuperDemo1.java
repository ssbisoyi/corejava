package ssb.superdemo;

import java.util.Scanner;

class Address{
	String city,state;
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Enter the Address: ");
		city=sc.next();
		state=sc.next();
	}
	void display(){
		System.out.println("City is: "+city+"\tState is: "+state);
	}
}
class Student extends Address{
	int roll;
	String name;
	Student(int roll, String name){
		//super("aaa","bbbb");
		this.roll=roll;
		this.name=name;
	}
	void display(){
		super.input();
		System.out.println("Roll is: "+roll+"\t Name is: "+name);
		super.display();
	}
}
public class SuperDemo1 {

	public static void main(String[] args) {
		//Address adr=new Address();
		Student st=new Student(1,"ssb");
		st.display();
		//super.display();

	}

}
