//WAP in java using this keyword as an arguments in the constructor call
class A
{
	B obj;
	A(B obj)
	{
		this.obj=obj;
		obj.display();
	}
}
class B
{
	int x=5;
	B()
	{
		A obj=new A(this);
	}
	void display()
	{
		System.out.println("Value of x in class B="+x);
	}
	public static void main(String args[])
	{
		B obj=new B();
	}
}