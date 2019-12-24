//WAP that show the partial implementation of interface.
interface A
{
	void disp1();
}
interface B
{
	void disp2();
}
class Test implements A,B
{
	public void disp1()
	{
		System.out.println("Interface A");
	}
	public void disp2()
	{
		System.out.println("Interface B");
	}
	public void disp3()
	{
		System.out.println("This is Test Class");
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.disp1();
		t.disp2();
		t.disp3();
	}
}