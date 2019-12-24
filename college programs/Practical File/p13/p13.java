// WAP that implement the Nested try statements.
class NestedTry
{
	public static void main(String args[])
	{
		int a[]={5,6,0};
		try
		{
			try
			{
				int b=a[1]/0;
				System.out.println("Value of b = "+b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			a[4]=a[1]/2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}