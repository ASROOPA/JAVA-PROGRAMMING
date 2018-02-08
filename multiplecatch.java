package packages;
import java.util.Scanner;
public class simple {
public static void main(String args[])
{
	try
	{
		int n,div;
		int[] a;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
		Scanner input1=new Scanner(System.in);
		a[i]=input1.nextInt();
		}
		div=a[2]/0;
		System.out.println(a[11]);
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array size large");
	}
	catch(ArithmeticException a)
	{
		System.out.println("dividing by zero");
	}
	System.out.println("thank you");
}
}
