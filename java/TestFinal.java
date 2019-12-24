class A
{
	final int a;
	A(int a)
	{
		this.a=a;
	}
}
class TestFinal
{
	public static void main(String args[])
	{
		A a=new A(5);
		System.out.println("a.a");
	}
}