import java.util.Arrays;
import java.util.Scanner;

/*class Sample{//6
	private int  i;
	private float a;
	public Sample(int ii,float aa){
		i=ii;
		a=aa;
	}
	public void Display() {
		System.out.println("i= "+i+"a= "+a);
	}
}*/

public class Arrays_Chapter_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int[]marks=new int[30];//1
int avg,sum=0,i;
Scanner k=new Scanner(System.in);
for(i=0;i<29;i++)
	{System.out.print("Enter marks= ");
marks[i]=k.nextInt();}

for(i=0;i<29;i++)
{	sum=sum+marks[i];
avg=sum/30;
System.out.println("Average is= "+avg);
}*/
		
		/*int []marks= {55,65,75,56,78,78,90};//2
		int i;
		for(i=0;i<7;i++)
		{Modify(marks[i]);}
		for(i=0;i<7;i++)
		{System.out.println(marks[i]);}
	}
	static void Modify(int m)
	{
		m=m*2;
	}*/
	
		/*int []marks= {55,65,75,56,78,78,90};//3
		int i;
		
		Modify(marks);
		
		for(i=0;i<=marks.length-1;i++)
		{System.out.println(marks[i]+"");}
	}
	static void Modify(int[] m)
	{ int i;
	for(i=0;i<=m.length-1;i++)
		{m[i]=m[i]*2;}*/
		
/*int[]p;//4
		p=Func();
		for(int i=0;i<=p.length-1;i++)
			System.out.println(p[i]+" ");
	}
	static int[] Func() 
	{
		int []arr= {10,20,30,40,50};
		return arr;
	}*/
	
		/*int []arr= {23,45,11,54,89,32};//5
		int i;
		System.out.println("orignal array");
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" , ");
		
		Arrays.sort(arr);
		System.out.println("\nSorted array");
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+"  , ");
		
		int index=Arrays.binarySearch(arr, i);//54 at place of i
		int [] newarr=new int[6];
		newarr=Arrays.copyOf(newarr, arr.length);
		System.out.println("\nNew array contents");
		for(i=0;i<newarr.length;i++)
			System.out.print(newarr[i]+" , ");
		
	Arrays.fill(arr, 0);
	System.out.println("\nCleared array");
	for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+"  , ");
	}*/
		
		/*Sample[] arr=new Sample[3];//6
		arr[0]=new Sample(10,3.14f);
		arr[1]=new Sample(20,6.28f);
		arr[2]=new Sample(30,3.55f);
		for(int i=0;i<arr.length;i++)
			arr[i].Display();*/
		
		/*int[][] a= {{7,2,6,1},{3,5,4,8},{6,2,9,50}};//7
		int i,j,big;
		int r,c;
		big=a[0][0];
		r=0;
		c=0;
		for(i=0,j=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				if(a[i][j]>big)
				{
				big=a[i][j];
		r=i;
		c=j;
		System.out.println("biggest number= "+big);
		System.out.println("row= "+r+"col= "+c);
				}
				}
			}	*/
		
		int [][]a=new int[3][];//8
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[2];
		a[0][0]=7;a[0][1]=2;a[0][2]=6;a[0][3]=1;
		a[1][0]=9;a[1][1]=3;a[1][2]=4;
		a[2][0]=1;a[2][1]=8;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
		System.out.print(a[i][j]+" ");
			}
		}
	}

	
		
		
	

