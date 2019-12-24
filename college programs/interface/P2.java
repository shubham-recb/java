interface A
{
	void disp1();
}
interface B extends A
{
	void disp2();
}
class C implements B 
{
	public void disp1()
	{
		System.out.println("Interface A");
	}
	public void disp2()
	{
		System.out.println("Interface B");
	}
	public static void main(String args[])
	{
		C ob=new B();
		ob.disp1();
		//ob.disp2();
	}
}