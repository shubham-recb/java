//WAP in java to using static keyword for static methods
class Method2
{
	static int a=10;
	int b=20;
	static void m1()
	{
		a=20;
		System.out.println("From m1");
		b=10;
		m2();
	}
	void m2()
	{
		System.out.println("From m2");
	}
	public static void main(String args[])
	{
		System.out.println("From main");
	}
}