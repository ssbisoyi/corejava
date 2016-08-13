package ssb.superdemo;

class A{
	protected int a;
	
}
class B extends A{
	int b;
	void input(){
		super.a=2;
		b=3;
	}
	void display(){
		System.out.println(a+"\t"+b);
	}
}
public class SuperDemo2 {

	public static void main(String[] args) {
		B ob=new B();
		ob.input();
		ob.display();

	}

}
