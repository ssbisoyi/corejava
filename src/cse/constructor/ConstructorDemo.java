package cse.constructor;
class Employee{
	int eid,sal;
	String name;
		Employee(int eid,int sal,String name){
		this.eid=eid;
		this.sal=sal;
		this.name=name;
	}
	void display(){
		System.out.println(eid+"\t"+name+"\t"+sal);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		
		new Employee(1,10000,"XYZ").display();
		//e.display();
	}
}
