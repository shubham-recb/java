//WAP in java using finally block exception occured & also handled
class p3
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("In try block");
			int data=25/0;
			System.out.println("Result="+data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero is not possible");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}