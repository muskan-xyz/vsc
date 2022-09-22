/*import java.util.*;
public class Fibonacci{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter count");
		int count=sc.nextInt();
		int  i,a=0,b=1,c;
		System.out.println(a);
		
		System.out.println(b);
		for (i=2;i<count;i++) {
			c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
			
		}
		
}}*/



import java.util.*;
public class Fibonacci{
	static int a=1,b=1,c;
	static void fibb (int count){
		if (count>0) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibb(count-1);
		}
		
	}
	
public static void main (String args[] ) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter count");
	int count=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	fibb(count-2);
    sc.close();
}
}

