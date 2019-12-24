class A
{
	void displayA()
	{
		System.out.println("This is class A");
	}
}
class B extends A
{
	void displayB()
	{
		System.out.println("This is class B");
	}
}
class C extends A
{
	void displayC()
	{
		System.out.println("This is class C");
	}
}
class HierarchicalInheritance
{
	public static void main(String args[])
	{
		B obj1=new B();
		obj1.displayA();
		obj1.displayB();
		C obj2=new C();
		obj2.displayA();
		obj2.displayC();
		
	}
}