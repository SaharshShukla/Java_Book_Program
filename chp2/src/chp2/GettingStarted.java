package chp2;

import java.util.Scanner;

public class GettingStarted {
	public static void main(String[]args) {
//CalculationOfSimpleIntrest
//		float p=1000.50f,r=15.5f,si;
//		int t=3;
//		si=p*r*t/100;
//		System.out.println("Simple Instrest is "+ si);
		/*CalculationOfAverages*/
//	int x=2,y=3,z=3;
//	float avg;
//	avg=(x+y+z)/3;
//	System.out.println("The avearge is "+avg);
//d(a)
//		float bs=10000.500f,da=0.4f,hra=0.5f,gs;
//		gs=bs*da*hra;
//		System.out.print("The gross salary is "+gs);
//		System.out.println("\nThe gross salary is "+gs);
//d(b)
//		int dstnBtwnTwoCty=200;
//		float m,inch,ft,cm;
//		m=dstnBtwnTwoCty/1000;
//		cm=dstnBtwnTwoCty/10000;
//		inch=cm*2.54f;
//		ft=cm*12;
//		System.out.println("The distn b/w two cites in km is "+dstnBtwnTwoCty);
//		System.out.println("The distn b/w two cites in m is "+m);
//		System.out.println("The distn b/w two cites in inch is "+inch);
//		System.out.println("The distn b/w two cites in feet is "+ft);
//		System.out.println("The distn b/w two cites in cm is "+cm);
//d(c)
//		Scanner s=new Scanner (System.in);
//		float s1,s2,s3,s4,s5;
//		float aggMarks,per;
//		System.out.print("Enter marks of subject first = ");
//		s1=s.nextFloat();
//		System.out.print("Enter marks of subject second = ");
//		s2=s.nextFloat();
//		System.out.print("Enter marks of subject threeth = ");
//		s3=s.nextFloat();
//		System.out.print("Enter marks of subject fourth = ");
//		s4=s.nextFloat();
//		System.out.print("Enter marks of subject fiveth = ");
//		s5=s.nextFloat();
//		aggMarks=s1+s2+s3+s4+s5;
//		per=aggMarks/5;
//		System.out.println("The aggreagate Marks is "+aggMarks);
//		System.out.println("The percentage is "+per);
//d(e)
		Scanner s=new Scanner(System.in);
		int l,b,area,peri,thi;
		float rad,pi=3.14f,aroc,coc;
		System.out.print("Enter length= ");
		l=s.nextInt();
		System.out.print("Enter breath= ");
		b=s.nextInt();
		System.out.print("Enter radius= ");
		rad=s.nextFloat();
		System.out.print("Enter Thitha= ");
		thi=s.nextInt();
		area=l*b;
		peri=2*(l+b);
		aroc=pi*rad*rad;
		coc=pi*rad*thi/360;
		System.out.println("area of rectangle is "+area);
		System.out.println("area of perimeter ofrectangle is "+peri);
		System.out.println("area of circle is "+aroc);
		System.out.println("area of rectangle is "+area);
		System.out.println("cricumceference of circle is "+coc);
		
}
	}
