//WAP a java programs using finnaly block exception occured and does not handled.
class P2
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("In try block");
			int data=25/0;
			System.out.println("Result="+data);
		}
		catch(NullPointerException)
		{
			System.out.println("Divided by zero is not possible");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}