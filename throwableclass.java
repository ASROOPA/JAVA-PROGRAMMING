package packages;

public class Sample extends ArithmeticException {
 void avg(){
	 int a=0,b=9,c;
	 c=b/a;
	 System.out.println("Function");
 }
 public static void main(String args[])
 {
	 try
	 {
		 Sample s=new Sample();
		 s.avg();
	 }
	catch(ArithmeticException e)
	 {
		System.out.println("Ecxeptions");
	 }
 }
}
