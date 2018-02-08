package packages;
import java.util.Scanner;
public class Arrays {
public static void main(String args[]) {
	try
	{
	int[] a;
	int n,sum=0;
	//input size of array
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	a=new int[n];
	for(int i=0;i<n;i++)
	{
		Scanner input1=new Scanner(System.in);
		a[i]=input1.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+a[10];
	}
	System.out.println("sum of array is "+sum);
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("array size is large");
	}
}
