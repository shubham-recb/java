//WAP in java to using final keyword for final method
class A
{
	final void display()
	{
		System.out.println("Inside class A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Inside class B");
	}
}
class Method
{
	public static void main(String args[])
	{
		A a=new A();
		a.display();
		B b=new B();
		b.display();
		A a2=new B();
		a2.display();
	}
}