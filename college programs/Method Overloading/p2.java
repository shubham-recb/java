//WAP in java to using method overloading by changing no. of parameters.
class p2
{
	void sum(int a,int b)
	{
		System.out.println("Addition!="+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Addition2="+(a+b));
	}
	public static void main(String args[])
	{
		p2 p=new p2();
		p.sum(10,20);
		p.sum(10,20,30);
	}
}