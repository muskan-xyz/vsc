
/*public class Array {
	public static void main(String args[]) {
		
		int i,j,k;
		int [][]x=new int [3][3];
		int [][]a= {{1,1,1},{2,2,2}};
		int [][]b= {{1,1,1},{2,2,2},{3,3,3}};
		for (i=0;i<2;i++) {
			for (j=0;j<3;j++) {
				for (k=0;k<3;k++) {
					x[i][j]=x[i][j]+(a[i][k]*b[k][j]);
					
			}
				System.out.print(x[i][j]+" ");
			
		}
			
			System.out.print("\n")	;
		}
	
}}*/
import java.util.*;
public class Array {
public static void main(String args[]) {
	int i,j,k;
	Scanner d = new Scanner(System.in);
	int [][]x=new int[2][3];
	System.out.println("Enter the elements of matrix A");
	for (i=0;i<2;i++) {
		for (j=0;j<3;j++) {
			x[i][j]=d.nextInt();
			
		}
		
	}
	int [][]y=new int[3][3];
	System.out.println("Enter the elements of matrix B");
	for (i=0;i<3;i++) {
		for (j=0;j<3;j++) {
			y[i][j]=d.nextInt();
		}
		
	}
	int [][]c=new int[2][3];
	for (i=0;i<2;i++) {
		for (j=0;j<3;j++) {
			for (k=0;k<2;k++) {
				c[i][j]=x[i][j]+(x[i][k]*y[k][j]);
				
		}
			System.out.print(c[i][j]+" ");
		
	}
		
		System.out.print("\n")	;
	}
	
	
}
}
