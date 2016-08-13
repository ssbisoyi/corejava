package ssb.constructor;

class MyConstructor{
	int a,b;
	MyConstructor(){
		System.out.println("Hello");
	}
	MyConstructor(int a,int b){
		//this();
		a=a;
		b=b;
		//this();
	}
	void display(){
		System.out.println("The values of a and b are: "+a+"\t"+b);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		MyConstructor ob=new MyConstructor(2,3);
		ob.display();
	}
	
}
