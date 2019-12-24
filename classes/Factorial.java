class Box
{
	int num;
	Box(int n)
	{
		num=n;
	}
	int factor()
	{
		int i,fact=1;
		for(i=num;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class Factorial
{
	public static void main(String args[])
	{
		Box b=new Box(5);
		int result=b.factor();
		System.out.println("Result="+result);
	}
}