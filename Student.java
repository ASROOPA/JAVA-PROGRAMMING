package package1;

import java.util.Scanner;

public class Student {
	public static void main(String args[])
	{
	int no,date;
	float gpaf = 0,gpab=0,avg;
	Scanner input1=new Scanner(System.in);
	no=input1.nextInt();
	char gender=input1.next().charAt(0);
	if(gender=='f'||gender=='F')
	{
	gpaf=input1.nextFloat();
	}
	if(gender=='m'||gender=='M')
	{
	gpab=input1.nextFloat();
	}
	avg=(gpaf+gpab)/2;
	System.out.println("Average is"+avg);
	}
}
