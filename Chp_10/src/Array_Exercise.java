import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise {
	/*int char[] mixed=new int char[100];//B(a)*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] num=new int[26];//A(a)
		int temp;
		num[0]=100;
		num[25]=200;
		temp=num[25];
		num[25]=num[0];
		num[0]=temp;
		System.out.println(num[0]+" "+num[25]);*/
		
		/*int[] array=new int[26];//A(b)
		for(int i=0;i<=25;i++)
		{
			array[i]='A'+i;
			System.out.println(array[i]+" "+(char)array[i]);
		}*/
		
		/*int[] sub =new int[50];//A(c)
		for(int i=0;i<=48;i++)
		{
			sub[i]=i;
			System.out.println(sub[i]);
		}*/
		
		/*int []a=new int[10];//B(a)
		Scanner k=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			a[i]=k.nextInt();
			System.out.println(a[i]);
		}*/
		
		/*int size;//B(b)
		Scanner k=new Scanner(System.in);
		size=k.nextInt();
		int[] arr=new int[size+10];
		for(int i=1;i<=size+10;i++)
		{
			arr[i]=k.nextInt();
			System.out.println(arr[i]);
		}*/
		
		/*int[] array1=new int[2];//D(a)
		int[] array2=new int[2];
		int[] array3=new int[2];
		int i,j,l;
		Scanner k=new Scanner(System.in);
		for(i=0;i<=array1.length-1;i++)
		{
			System.out.print("Entre number for array=  ");
			array1[i]=k.nextInt();
		}
		array2=Arrays.copyOf(array1, i);//copying of arr1 to arr2
		for(j=0;j<=array2.length-1;j++)
		{
		System.out.println(array2[j]+" "+"case "+j);	
		}
		for(l=0;l<array3.length;l++)
		{
			System.out.print("Enter number to check=  ");
			array3[l]=k.nextInt();
			array3[l]=Arrays.mismatch(array2, array3);
			
				System.out.println(array3[l]);}*/
		
		int[]num=new int[5];
		int[]p=new int[5];
		int[]e=new int[5];
		int i,l,m;
		Scanner scanner=new Scanner(System.in);
		for(i=0;i<=num.length-1;i++)
		{
			System.out.print("Enter number=  ");
			num[i]=scanner.nextInt();
		}
		for(i=0;i<=num.length-1;i++)
		{
			System.out.println("array value is "+num[i]+" and the loop is "+i);
		}
		
		p[l]=postitive(num);
        e[m]=even(num);
	}
 static int postitive(int[]x)
 {
	 int l,m;
	 int[] output=new int[5];
	 for(m=0;m<output.length;m++)
	 {output[m]=Math.absExact(x[l]);
	 System.out.println(output[m]);}
	 
	 
 }

