import java.util.Arrays;

public class TwoD_Array_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [][] flats= {{101,102,103},{201,202,203}};
//
//for(int i=0;i<flats.length;i++){
//	for(int j=0;j<flats[i].length;j++){
//System.out.println("flats[0][0]= "+flats[0][0]);
//System.out.println("flats[0][1]= "+flats[0][1]);
//System.out.println("flats[0][2]= "+flats[0][2]);
//System.out.println("flats[1][0]= "+flats[1][0]);
//System.out.println("flats[1][1]= "+flats[1][1]);
//System.out.println("flats[1][2]= "+flats[1][2]);
//}
//}
// sum of 5 float array//1
	//	Scanner scanner=new Scanner(System.in);
//		float[]a=new float[5];
//		float sum=0;
//	System.out.print("Enter value of array 1= ");
//	a[0]=scanner.nextFloat();
//	System.out.print("Enter value of array 2= ");
//	a[1]=scanner.nextFloat();
//	System.out.print("Enter value of array 3= ");
//	a[2]=scanner.nextFloat();
//	System.out.print("Enter value of array 4= ");
//	a[3]=scanner.nextFloat();
//	System.out.print("Enter value of array 5= ");
//	a[4]=scanner.nextFloat();
//	sum=a[0]+a[1]+a[2]+a[3]+a[4];
//System.out.println("The sum of float array is "+sum);
//System.out.println(" array  lenght is "+a.length);

//int num;//2
//for(int i=0;i<integer.length;i++) {
//System.out.print("Enter number= ");
//num=scanner.nextInt();
//if((num==integer[0])|(num==integer[1])|(num==integer[2])|(num==integer[3])|(num==integer[4]))
//System.out.println("The enterd array is present in the array");
//else
//	System.out.println("The enterd arrray is not present in the given array");
//}

//		int[]marks=new int[30];//3
//		int avg,sum=0;
//		for(int i=0;i<marks.length;i++) {
//			System.out.print("Enter marks of student= ");
//			marks[i]=scanner.nextInt();
//			sum=sum+marks[i];}
//			avg=sum/30;
//System.out.println("The average marks in physic of 530 student is "+avg);
	
//		int[][]a=new int[2][3];//4
//		int[][]b=new int[2][3];
//		int[][]c=new int[2][3];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print("Enter row 0,column 0 of matrix 1=  ");
//				a[0][0]=scanner.nextInt();
//				System.out.print("Enter row 0,column 1 of matrix 1=  ");
//				a[0][1]=scanner.nextInt();
//				System.out.print("Enter row 0,column 2 of matrix 1=  ");
//				a[0][2]=scanner.nextInt();
//				System.out.print("Enter row 1,column 0 of matrix 1=  ");
//				a[1][0]=scanner.nextInt();
//				System.out.print("Enter row 1,column 1 of matrix 1=  ");
//				a[1][1]=scanner.nextInt();
//				System.out.print("Enter row 1,column 2 of matrix 1=  ");
//				a[1][2]=scanner.nextInt();
//		}
//		}
//			for(int d=0;d<b.length;d++) {
//				for(int e=0;e<b[d].length;e++) {
//					System.out.print("Enter row 0,column 0 of matrix 2=  ");
//					b[0][0]=scanner.nextInt();
//					System.out.print("Enter row 0,column 1 of matrix 2=  ");
//					b[0][1]=scanner.nextInt();
//					System.out.print("Enter row 0,column 2 of matrix 2=  ");
//					b[0][2]=scanner.nextInt();
//					System.out.print("Enter row 1,column 0 of matrix 2=  ");
//					b[1][0]=scanner.nextInt();
//					System.out.print("Enter row 1,column 1 of matrix 2=  ");
//					b[1][1]=scanner.nextInt();
//					System.out.print("Enter row 1,column 2 of matrix 2=  ");
//					b[1][2]=scanner.nextInt();
//				
//				c[0][0]=a[0][0]+b[0][0];
//				c[0][1]=a[0][1]+b[0][1];
//				c[0][2]=a[0][2]+b[0][2];
//				c[1][0]=a[1][0]+b[1][0];
//				c[1][1]=a[1][1]+b[1][1];
//				c[1][2]=a[1][2]+b[1][2];
//			}
//			}
//		for(int v=0;v<c.length;v++) {
//			for(int x=0;x<c[v].length;x++) {
//				System.out.println("The value of a[0][0]+b[0][0] is "+c[0][0]);
//				System.out.println("The value of a[0][1]+b[0][1] is "+c[0][1]);
//				System.out.println("The value of a[0][2]+b[0][2] is "+c[0][2]);
//				System.out.println("The value of a[1][0]+b[1][0] is "+c[1][0]);
//				System.out.println("The value of a[1][1]+b[1][1] is "+c[1][1]);
//				System.out.println("The value of a[1][2]+b[1][2] is "+c[1][2]);
//			}
//		}
		
//		int[]reverse= {1,2,3,4,5};//5
//		for(int i=reverse.length-1;i>=0;i--) {
//			System.out.println(reverse[i]);
		
		int[]num= {123,12,34,56};
		int b=Arrays.binarySearch(num, 126);
		System.out.println(b);
		
//		int[]num= {123,234,457,3247};//8
//Arrays.sort(num);
//for(int i=0;i<num.length;i++)
//System.out.println(num[i]);
	
		}
}		
