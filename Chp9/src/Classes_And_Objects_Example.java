import java.util.Scanner;

/*class Rectangle{ex9.1
	private int len,br;
	public void getData() {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter lenght= ");
		len=k.nextInt();
		System.out.println("Enter breath= ");
		br=k.nextInt();
	}
	public void setData(int l,int b) {
		
		len=l;
		br=b;
	}
	public void displayData() {
		System.out.println("Length= "+len);
		System.out.println("Breath= "+br);
	}
	public void areaPeri() {
		int a,p;
		a=len*br;
		p=2*(len+br);
		System.out.println("area= "+a);
		System.out.println("perimeter= "+p);
	}
}*/

/*class Int{ex9.2
	private int i;
	public void getData() {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any interger= ");
		i=k.nextInt();
	}
	public void setData(int j) {
		i=j;
	}
	public Int() {
	}
	public Int(int j) {
		i=j;
	}
	public void displayData() {
		System.out.println("value of i= "+i);
	}
	}*/

/*class Example {ex9.3
	private int data;
	public Example() {
System.out.println("Inside Constructor");
}
	protected void finalize()  throws Throwable{
		super.finalize();
		}
	}*/

/*class Example {//ex9.5
	private int i;
	public void setData(int ii) {
		i=ii;
		this.i=ii;
	}
	public void showData() {
		System.out.println(i);
		System.out.println(this.i);
	}
}*/

/*class MyDate{//Exercise B(a)
	private int dd,mm,yy;
	public MyDate() {
		System.out.println("Reached");
		System.out.println(this);
	}
}*/

/*class StudentRecord{//Exercise B(b)
	private int m1,m2,m3;
	private float percentage;
	public StudentRecord() {
		m1=m2=m3=0;
		percentage=0.0f;
	}
	public void CalculatePercentage(int x,int y,int z) {
		m1=x;m2=y;m3=z;
		percentage=(m1+m2+m3)/3.0f;
	}
	public void DisplayPercentage() {
		System.out.println("Percentage= "+percentage);
	}
}*/

/*class Control{//Exercise B(c)
	public Control() {
		calculate();
		System.out.println("Constructor");
	}
	void calculate() {
		display();
		System.out.println("Calculator");
	}
	void display() {
		System.out.println("displayed");
	}
}*/

/*class Sample{//Exercise B(d)
	public static int d,m,y;
	static {
		d=m=y=10;
	} 
	public Sample() {
		y++;
		m++;
		d++;
	}
	public static void Show() {
		System.out.println("y: "+y);
		System.out.println("m: "+m);
		System.out.println("d: "+d);
	}
}*/

class Sample{//Exercise B(e)
	int i;
	float j;
	public void SetData(int i,float j) {
		i=i;
		j=j;
	}
	public void Display() {
		System.out.println(i+" "+j);
	}

}
public class Classes_And_Objects_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Rectangle r1,r2,r3;//ex9.1
r1=new Rectangle();
r2=new Rectangle();
r3=new Rectangle();

r1.setData(10, 20);
r1.displayData();
r1.areaPeri();

r2.setData(5, 8);
r2.displayData();
r2.areaPeri();

r3.getData();
r3.displayData();
r3.areaPeri();*/
/*Int i1,i2,i3;
i1=new Int(100);
i1.displayData();

i2=new Int();//ex9.2
i2.displayData();
i2.setData(200);
i2.displayData();

i3=new Int();
i3.displayData();
i3.getData();
i3.displayData();*/
		
	/*	Example e=new Example();*///ex9.3
		
	/*Example e1;
	e1=new Example();
	e1.setData(10);
	e1.showData();*/
		
		/*MyDate today=new MyDate();//Exercise B(a)
		MyDate tommorrow=new MyDate();*/
		
/*StudentRecord s1;//Exercise B(b)
s1=new StudentRecord();
s1.DisplayPercentage();
s1.CalculatePercentage(35, 35, 35);
s1.DisplayPercentage();*/
		
/*Control c1;//Exercise B(c)
c1=new Control();*/
		
		/*Sample s=new Sample();//Exercise B(d)
		s.Show();*/
		
		Sample s1=new Sample();//Exercise B(e)
		s1.SetData(10, 5.4f);
		s1.Display();
}

}
