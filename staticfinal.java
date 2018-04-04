package package1;
class X
{
	public static final int a=2;
}
interface I
{
	public int a=1;
}
class C extends X
{
	public static void main(String args[])
	{
		System.out.println("value of a is"+a);
	}
}
