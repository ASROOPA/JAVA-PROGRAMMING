package packages;

public class Test {
	static void avg() throws ArithmeticException
	{
		int a=0,b=9,c;
		c=b/a;
		System.out.println("Throwable function");
	}
	public static void main(String args[])
	{
		try
		{
			avg();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmrtic exception");
		}
	}
}
