interface A
{
	void disp();
}
class B implements A
{
	public void disp()
	{
		System.out.println("Interface A");
	}
	public static void main(String args[])
	{
		A b=new B();
		b.disp();
	}
}