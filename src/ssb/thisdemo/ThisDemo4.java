package ssb.thisdemo;
class Project{
	int pid,duration;
	void input(){
		pid=1;
		duration=20;
	}
	void show(){
		System.out.println(pid+"\t"+duration);
	}
	void display(){
		this.input();
		this.show();
	}
}
public class ThisDemo4 {
	public static void main(String[] args) {
		Project p=new Project();
		p.display();
	}
	
}
