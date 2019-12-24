//WAP in java using this() to invoke current class constructor
class Test1
{
	int a;
	int b;
	Test1()
	{
		this(10,20);
	}
	Test1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Value of A="+a+"\nValue of B="+b);
	}
	public static void main(String args[])
	{
		Test1 t=new Test1();
	}
}