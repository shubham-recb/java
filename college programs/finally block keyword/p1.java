//WAP in java to using finally block when exception does not occured.
class p1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("In try block");
			int data=25/5;
			System.out.println("Result="+data);
		}
		catch(NullPointerException e)
		{
			System.out.println("Dived by zero is not possible");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}