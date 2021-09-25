import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

public class Chp7_Example_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.print("I am in main");//ex7.1
message();
	}
	static void message()
	{
System.out.println("\nI am in function");
}*/

		/*System.out.println("I am in main");//ex7.2
		brazil();
		italy();
		argentina();
		System.out.println("I am in back in main");
}
	static void brazil()
	{
		System.out.println("I am in brazil");
	}
	static void italy()
	{
		System.out.println("I am in italy");
	}
	static void argentina()
	{
		System.out.println("I am in argentina");*/
		
		/*System.out.println("I am in main");
		italy();
		System.out.println("I am back in main");
	}
	static void italy()
	{System.out.println("I am in italy");
	brazil();
	System.out.println("I am back in italy");
	}
	
	static void brazil()
	{System.out.println("I am in brazil");
	argentina();
	}
	
	static void argentina()
	{System.out.println("I am in argentina");*/
		
		
		/*int a=0,b=0,c=0,sum;//ex7.3
		Scanner k=new Scanner(System.in);
		System.out.print("Enter value of a= ");
		a=k.nextInt();
		System.out.print("Enter value of b= ");
		b=k.nextInt();
		System.out.print("Enter value of c= ");
		c=k.nextInt();
		sum=cal(a,b,c);
		System.out.println("The sum is  "+sum);
	}
	static int fun()
	{
		int d;
		d=x+y+z;
		return(d);*/
		
		/*int i=20;
		display(i);
		
	}
	static void display(int j)
	{
		int k=35;
		System.out.println(j);
		System.out.println(k);*/
		
		/*int a=0,fact;//ex 7.4
		Scanner k=new Scanner(System.in);
		System.out.println("Enter any number=  ");
		a=k.nextInt();
		fact=factorial(a);
		System.out.println("The factorial of  "+a+"is "+fact);
	}
	static int factorial(int x)
	{
		int f=1,i;
		for(i=x;i>=1;i--)
			f=f*1;
		return(f);*/
		int n,fac;//ex 7.5
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any number= ");
		n=k.nextInt();
		fac=rec(n);
		System.out.println("The factorial of "+n+" is "+fac);
}
	static int rec(int x)
	{
		int f;
		if(x==1)
			return(1);
		else 
			f=x*rec(x-1);
			return(f);
		
	}
}
