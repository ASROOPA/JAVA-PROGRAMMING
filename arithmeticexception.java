import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
 try
 {
  int a, b, result;
 
   //System.out.println("Input two integers");
 
  Scanner input=new Scanner(System.in);
  a=input.nextInt();
  b=input.nextInt();
 
  result = a/b;
 
  System.out.println("Result = " + result);
 }
 catch(ArithmeticException e)
 {
 	System.out.println("Arithmetic error");
 	
 }
 System.out.println("completed");
  }
}
