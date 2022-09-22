 /*import java.io.*;

public class Simple{
	public static void main(String args [] )throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s =br.readLine(); //for string 
		int x = Integer.parseInt(br.readLine());
		System.out.println("you entered"+x);
		System.out.println("you entered a string"+s);
		
	}

}
import java.util.*;
public class Simple{
	public static void main(String[] args)
{
	Scanner br=new Scanner (System.in);
	System.out.println("enter a string ");
	String s =br.next();
	System.out.println("you entered" +s);
	
	
	System.out.println("enter a integer ");
	
	int x =br.nextInt();
	System.out.println("you entered" +x);
}
}*/
import java.io.*;
public class Simple{
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter value of a ");
		int a =Integer.parseInt(br.readLine());
		System.out.println("enter value of b ");
		int b =Integer.parseInt(br.readLine());
		System.out.println("enter value of c ");
		int c =Integer.parseInt(br.readLine());
		
		 
		 int d=b*b-4*a*c;
		System.out.println("discriminant"+d);
		if (d>0) {
			double r1 = (-b+Math.pow(d, 0.5))/(2*a);
			double r2 = (-b-Math.pow(d, 0.5))/(2*a);
			System.out.println("roots are "+r1  +r2);
			
			
		}
		else if (d==0) {
			double r1 = (-b+Math.pow(d, 0.5))/2;
			System.out.println("roots are "+r1);
			
			
		}
		else {
			System.out.println("roots are not real");
		
			
		}
	}
	
}
/*import java.util.*;
public class Simple{
	public static void main(String[] args)

{
	Scanner br=new Scanner (System.in);
	System.out.println("enter numbers");
	int a =br.nextInt();
	int b =br.nextInt();
	int c =br.nextInt();
	double d = b*b-4*a*c;
	if (d>0) {
		double r1 = (-b+Math.pow(d, 0.5))/(2*a);
		double r2 = (-b-Math.pow(d, 0.5))/(2*a);
		System.out.println("roots are "+r1  +r2);
		
		
	}
	else if (d==0) {
		double r1 = (-b+Math.pow(d, 0.5))/2;
		System.out.println("roots are "+r1);
		
		
	}
	else {
		System.out.println("roots are not real");
	
		
	}
	
	
}}*/



