class A
{
	void displayA()
	{
		System.out.println("This is class A");
	}
}
class B
{
	void displayB()
	{
		System.out.println("This is class B");
	}
}
class C extends A,B
{
	void displayC()
	{
		System.out.println("This is class C");
	}
}
class MultipleInheritance
{
	public static void main(String args[])
	{
		c obj=new C();
		obj.displayA();
		obj.displayB();
		obj.displayC();
		
	}
}