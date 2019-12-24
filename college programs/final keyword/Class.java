//WAP in java to using final keyword for classes
final class A
{
	A()
	{
		System.out.println("Inside class A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Inside class B");
	}
}
class Class
{
	public static void main(String args[])
	{
		B b=new B();
	}
}