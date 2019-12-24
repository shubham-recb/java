//WAP in java to find the largest & smallest number in an array.
interface A
{
	void dispalyA();
}
interface B
{
	void dispalyB();
}
class C implements A,B
{
	public void dispalyA()
		{
			System.out.println("Interface A");
		}
		public void dispalyB()
		{
			System.out.println("Interface B");
		}
		public void dispalyC()
		{
			System.out.println("Class C");
		}
	public static void main(String args[])
	{
		C c=new C();
		c.dispalyA();
		c.dispalyB();
		c.dispalyC();
	}
}