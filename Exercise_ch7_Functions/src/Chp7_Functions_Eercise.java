import java.util.Scanner;

public class Chp7_Functions_Eercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10,b=20;
		modify();
		System.out.println(a);
		System.out.println(b);

	}
	static int modify()
	{a++;
	b++;}*/

		/*int i=45,c;//A(b)
		c=check(i);
		System.out.println(c);
	}
	static int check(int ch)
	{if(ch>=45)
		return(100);
	else 
		return(10);*/
	/*message(message());	
	}
	static void message()
	{System.out.println("its a small");*/
	
	/*int n=0,fac=0;//D(a)
	Scanner k=new Scanner(System.in);
	System.out.print("Enter any number=  ");
	n=k.nextInt();
	fac=factorial(n);
	System.out.println("Factorial of  "+n+ " is "+fac);
	}
	static int factorial(int x)
	{
		int f=1,i;
		for(i=x;i>=1;i--)
			f=f*i;
		return(f);*/
		
	/*int  a,b,y;//D(b)
	Scanner k=new Scanner(System.in);
	System.out.print("Enter value of a=  ");
	a=k.nextInt();
	System.out.print("Enter value of b=  ");
	b=k.nextInt();
	y=power(a,b);
	System.out.println("The power of "+a+" raised to "+b+" is "+y);
	}
	
	static int power(int x,int y)
	{
		int z;
		z=(int)Math.pow(x, y);
		return(z);*/
		
		/*int cy;//D(d)
		Scanner k=new Scanner(System.in);
		System.out.print("Enter year= ");
		cy=k.nextInt();
		test(cy);
	}
	static void test(int year)
	{
		if(year%4==0)
			System.out.println("The entered year "+year+" is "+"Leap Year");
		else
			System.out.println("The entered year "+year+" is "+"Normal Year");*/
		
/*int a;//F(a)
float b;
int pr;
Scanner k=new Scanner(System.in);
System.out.print("Enter value of a= ");
a=k.nextInt();
System.out.print("Enter value of b= ");
b=k.nextFloat();
pr=product(a,(int) b);
System.out.println("The poduct of "+a+" & "+b+" is "+pr);
	}
	static int product(int a,int b)
	{
		int c;
		c=a*b;
		return(c);*/

	/*int n1,n2,n3,n4,n5,sum,avg,sd;//F(b)
	Scanner k=new Scanner(System.in);
	System.out.print("Enter value of number 1= ");
	n1=k.nextInt();
	System.out.print("Enter value of number 2= ");
	n2=k.nextInt();
	System.out.print("Enter value of number 3= ");
	n3=k.nextInt();
	System.out.print("Enter value of number 4= ");
	n4=k.nextInt();
	System.out.print("Enter value of number 5= ");
	n5=k.nextInt();
	sum=s(n1,n2,n3,n4,n5);
	avg=average(n1,n2,n3,n4,n5);
	sd=stand(n1,n2,n3,n4,n5);
	System.out.println("The Sum of "+n1+","+n2+","+n3+","+n4+","+n5+" is "+sum);
	System.out.println("The Average of "+n1+","+n2+","+n3+","+n4+","+n5+" is "+avg);
	System.out.println("The Standard Deviation of "+n1+","+n2+","+n3+","+n4+","+n5+" is "+sd);
	}
	
	static int s(int x1,int x2,int x3,int x4,int x5)
	{ int y;
	y=x1+x2+x3+x4+x5;
	return(y);	
	}
	static int average(int a,int b,int c,int d,int e)
	{
		int x=(a+b+c+d+e)/5;
		return(x);
	}
	static int stand(int a,int s,int d,int f,int g)
	{
int n1;
int w=(a+s+d+f+g)/5;
n1=w-a;
n1=w-s;
n1=w-d;
n1=w-f;
n1=w-g;
return(n1);*/
		
/*int s1,s2,s3,avg,pr;//F(c)
Scanner k=new Scanner(System.in);
System.out.print("Enter marks of subject one= ");
s1=k.nextInt();
System.out.print("Enter marks of subject second= ");
s2=k.nextInt();
System.out.print("Enter marks of subject third= ");
s3=k.nextInt();
avg=average(s1,s2,s3);
pr=percentage(s1,s2,s3);
System.out.println("The average of  subject is "+avg);
System.out.println("The percentage of subject is "+pr+"%");
	}
	static int average(int a,int b,int c)
	{
		return((a+b+c)/3);
	}
	static int percentage(int a,int b,int c)
	{
		return((a+b+c)/3);*/
		
		/*int num,s;//H(a)(1)
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a  5-digit number = ");
		num=k.nextInt();
		s=sum(num);
		System.out.println("The sum of 5-digit number is "+s);}
	static int sum(int x)
	{
		int f=1,i;
		for(i=x;i>x;i++)
			f=f+i;
		return(f);*/
		
	/*	int num,s;//H(e)
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a number = ");
		num=k.nextInt();
		s=sum(num);
		System.out.println("Sum of  first "+num+" natural number is "+s);
	}
	static int sum(int x)
	{
		int d=(x*(x+1))/2;
		return(d);*/
		
		/*int a,b,c,ar;//H(i)
		Scanner k=new Scanner(System.in);
		System.out.print("Enter side a of triangle= ");
		a=k.nextInt();
		System.out.print("Enter side b of triangle= ");
		b=k.nextInt();
		System.out.print("Enter side c of triangle= ");
		c=k.nextInt();
		ar=area(a,b,c);
		System.out.println("The area of traingle is "+ar);
		}
	
	static int area(int x,int y,int z)
	{
int v,b,n,ar;
int s=(x+y+z)/2;
v=s-x;
b=s-y;
n=s-z;
ar=s*v*b*n;
return((int)Math.sqrt(ar));*/
	
		Scanner k=new Scanner(System.in);
		int a,f;
		System.out.printf("Enter any number =  ");
		a=k.nextInt();
		table(a);
	}
	static void table(int x)
	{
		System.out.println(x+"*1 = "+x*1);
		System.out.println(x+"*2 = "+x*2);
		System.out.println(x+"*3 = "+x*3);
		System.out.println(x+"*4 = "+x*4);
		System.out.println(x+"*5 = "+x*5);
		System.out.println(x+"*6 = "+x*6);
		System.out.println(x+"*7 = "+x*7);
		System.out.println(x+"*8 = "+x*8);
		System.out.println(x+"*9 = "+x*9);
		System.out.println(x+"*10 = "+x*10);
	}
	}
