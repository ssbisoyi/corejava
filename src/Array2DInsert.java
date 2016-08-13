import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array2DInsert {
	public static void main(String[] args) throws NumberFormatException, IOException{
		int r,c;
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of rows and cols");
		r=Integer.parseInt(bfr.readLine());
		c=Integer.parseInt(bfr.readLine());
		System.out.println("Enter the elements of "+r+" rows and "+c+ "cols");
		int arr2d[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr2d[i][j]=Integer.parseInt(bfr.readLine());
			}
		}
		System.out.println("The Array elements are: ");
		for(int arr[]:arr2d){
			for(int a:arr){
				System.out.print(a+"\t");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr2d));
		System.out.println("Array length is: "+arr2d.length);
	}
}
