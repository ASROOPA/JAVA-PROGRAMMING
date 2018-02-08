package packages;
import java.util.Scanner;
public class Division {
	 public static void main(String[] args) {
		 try {
		 
		  int a, b, result;
		 
		    System.out.println("Input two integers");
		 Scanner input = new Scanner(System.in);
		  a = input.nextInt();
		  Scanner input1 = new Scanner(System.in);
		  b = input1.nextInt();
		 
		  result = a / b;
		 
		  System.out.println("Result = " + result);
		  }
	 
	 catch(ArithmeticException e)
	 {
		System.out.println("Arithmetic error"); 
	 }
	 }
}
