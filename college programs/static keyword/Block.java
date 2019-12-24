//WAP in java to using this keyword for block statement
class Block
{
	static int a=10;
	static int b;
	static
	{
			System.out.println("static block initialize");
			b=a*4;
	}
	public static void main(String args[])
	{
		System.out.println("From main");
		System.out.println("Value of A="+a);
		System.out.println("Value of B="+b);
	}
}
