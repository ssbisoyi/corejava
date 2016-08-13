package ssb.superdemo;

class Employee{
	int eid;
	String name;
	Employee(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
}
class Manager extends Employee{
	String dept;
	Manager(String dept, int eid,String name){
		super(eid,name);
		this.dept=dept;
	}
	void display(){
		System.out.println("Dept"+"\tNAME"+"\tEID");
		System.out.println("=====================");
		System.out.println(eid+"\t"+name+"\t"+dept);
	}
}
public class SuperDemo3 {

	public static void main(String[] args) {
		Manager mgr=new Manager("Production",101,"Sudhanshu");
		mgr.display();
	}

}
