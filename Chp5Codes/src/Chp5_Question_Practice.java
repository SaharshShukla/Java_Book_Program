
import java.util.Scanner;

public class Chp5_Question_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
System.out.println("A B C D E F G F E D C B A");//E(f)
System.out.println("A B C D E F   F E D C B A");
System.out.println("A B C D E       E D C B A");
System.out.println("A B C D           D C B A");
System.out.println("A B C               C B A");
System.out.println("A B                   B A");
System.out.println("A                       A");*/

		
/*int ovpay=0,h=0,i;//B(a)
Scanner k=new Scanner(System.in);
for (i=0; i < 10; i++) {
	System.out.print("Enter hour=  ");
	h=k.nextInt();
	ovpay=h*12;
	if (h>40) 
		
		System.out.println("Over time pay is  "+ovpay+" ,loop no  "+i);
	
		else 
			System.out.println("No overtime"+" ,loop no  "+i);}*/
		
	/*double a=0.0f,b=0.0f,c=0.0;//B(c)
	int i;
	Scanner k=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		System.out.print("Enter value of a= ");
		a=k.nextDouble();
		System.out.print("Enter value of b= ");
		b=k.nextDouble();
		c=Math.pow(a, b);
		System.out.println("The value of c is  "+c+" ,The loop number is  "+i);
	}*/
		
/*int a=0;//B(c)
char v;
int i=0;
Scanner k=new Scanner(System.in);
while (i<=255) {
	System.out.print("Enter value from 0 to 255=  ");
	a=k.nextInt();
	v=(char)a;
	System.out.println("ASCII value is  "+v+"  loop no  "+i);
	i++;}*/
	
/*float a=0.0f;//E(a)
int i;
Scanner k=new Scanner(System.in);
for (i=0; i <=300; i++) 
{
	System.out.print("Enter number between 1 to 300 =  ");
	a=k.nextFloat();
if (a%2==0) 
{System.out.println("The  "+a+" is not prime number "+",Loop number is "+i);}
else 
{System.out.println("The "+ a+"  number is prime number"+",Loop number is  "+i);}
}*/

/*int i=0;//E(b)
char v;
Scanner k=new Scanner(System.in);
for (i = 0;  i<= 255; i++) {
	System.out.print("Enter value b/w =  ");
	i=k.nextInt();
	v=(char)i;
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
	System.out.println(v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v+""+v);
}*/

/*int y=0,a=0;//E(e)
float x=0.0f,i=0.0f;
Scanner k=new Scanner(System.in);
	for (a = 0;  a<6; a++) {
		System.out.print("Enter value of y b/w 1 to 6= ");
		y=k.nextInt();
		System.out.print("Enter value of x b/w 5.5 to 12.5=  ");
		x=k.nextFloat();
		if(y>6&x>12.5)
			System.out.println("Value is out of range");
		else	
i=2+(y+0.5f*x);
System.out.println("Approx. level of inteligence is "+i*0.5f);}*/

 /*int i,l;//E(i)
 Scanner k=new Scanner(System.in);
 
 for ( l = 0; l < 3; l++) {
	 System.out.print("Enter any number=  ");
	 i=k.nextInt();
	 System.out.println("one  "+i*1+" Loop no is "+l);
	 System.out.println("Two "+i*2+" Loop no is "+l);
	 System.out.println("Three "+i*3+" Loop no is "+l);
	 System.out.println("Four  "+i*4+" Loop no is "+l);
	 System.out.println("Five "+i*5+" Loop no is "+l);
	 System.out.println("Six  "+i*6+" Loop no is "+l);
	 System.out.println("Seven  "+i*7+" Loop no is "+l);
	 System.out.println("Eight  "+i*8+" Loop no is "+l);
	 System.out.println("Nine "+i*9+" Loop no is "+l);
	 System.out.println("Ten  "+i*10+" Loop no is "+l);
}*/
		
		/*int p=0,r=0,q=0,n=0,a=0,i;
		Scanner k=new Scanner(System.in);
for (i = 0; i < 10; i++) {
	System.out.print("Entr principle value=  ");
	p=k.nextInt();
	System.out.print("Enter rate value=  ");
	r=k.nextInt();
	System.out.print("Enter compound intrest value= ");
	q=k.nextInt();
	System.out.print("Enter time value=  ");
	n=k.nextInt();
a=p*(1+r/q)*Pow(n*q);	
} */
	/*	
		System.out.println("              1                           ");//E(g)
		System.out.println(              "           2     3");
System.out.println("        4     5     6 ");
System.out.println(        "     7     8     9     10");*/
		
		/*System.out.println("           1");//E(h)
		System.out.println("        1     1");
		System.out.println( "     1     2     1");
System.out.println("  1     3     3     1");
System.out.println("1    4     6     4     1");*/
	}

}
