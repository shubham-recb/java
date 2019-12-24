//WAP in a java using this keyword to return current class instance
class Test2
{
	int a;
	int b;
	Test2()
	{
		a=10;
		b=20;
	}
	Test2 get()
	{
		return this;
	}
	void display()
	{
		System.out.println("Value of A="+a+"\nValue of B="+b);
	}
	public static void main(String args[])
	{
		Test2 t=new Test2();
		t.get().display();
	}
}