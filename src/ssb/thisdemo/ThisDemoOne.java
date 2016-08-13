package ssb.thisdemo;

class Employee{
	int id,salary;
	String name;
	Employee(){
		System.out.println("This is the default constructor");
	}
	Employee(int id,int salary){
		this();
		System.out.println("Received two arguments");
		this.id=id;
		this.salary=salary;
	}
	Employee(int id,String name,int salary){
		
		this(id,salary);
		this.name=name;
		System.out.println("Passed two arguments");
	}
	void display(){
		System.out.println(id+"\t"+name+"\t"+salary+"\t");
	}
}
public class ThisDemoOne {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"ssb",10000);
		e1.display();
	}
}
