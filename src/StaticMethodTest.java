import java.util.Scanner;

class StaticMethod {
	int a,b;
	static int c=10;
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void show(){
		System.out.println("The values are:"+a+"\t"+b);
		System.out.println(c);
		System.out.println("");
	}
	static void display(){
		//System.out.println("The values for static method are: "+a+"\t"+b);
		System.out.println("The values for static method is: "+c);
		//System.out.println(a);
	}
	
}
public class StaticMethodTest{
	public static void main(String args[]){
		StaticMethod ob=new StaticMethod();
		ob.input();
		ob.show();
		StaticMethod.display();
	}
}
