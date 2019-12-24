//WAP in java using this keyword as a method parameter
class Test3
{
	int a;
	int b;
	Test3()
	{
		a=10;
		b=20;
	}
	void get()
	{
		display(this);
	}
	void display(Test3 obj)
	{
		System.out.println("Value of A="+a+"\nValue of B="+b);
	}
	public static void main(String args[])
	{
		Test3 t=new Test3();
		t.get();
	}
}