import java.util.Scanner;

public class ArrayInsertElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements into the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are:");
		for(int i:arr){
			System.out.print(i+"\t");
		}
		sc.close();
	}
}
