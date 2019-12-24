//WAP in java to using this keyword to refer current class instanse variable
class Test
{
	String a;
	String b;
	Test(String a,String b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("Value of A="+a+"\nValue of B="+b);
	}
	public static void main(String args[])
	{
		Test t=new Test("Shubham","Shivam");
		t.display();
	}
}