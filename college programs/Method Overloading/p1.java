//WAP in java to using method overloading by changing data types of parameters
class p1
{
	void sum(char a,int b)
	{
		System.out.println("Addition1="+(a+b));
	}
	void sum(byte a,float b)
	{
		System.out.println("Addition2="+(a+b));
	}
	public static void main(String args[])
	{
		p1 p=new p1();
		p.sum(10,10l);
	}
}