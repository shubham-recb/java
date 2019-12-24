class ExHandle
{
	public static void main(String [] args)
	{
		System.out.println("Shubham in 1st");
		System.out.println("Shubham in 2nd");
		System.out.println("Shubham in 3rd");
		System.out.println("Shubham in 12th");
		System.out.println("Shubham in diploma");
		System.out.println("Shubham in B.tech");
		System.out.println("Shubham become a software Engineer.");
		try
		{
			System.out.println("Shubham Weds Girl"+(10/0));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Shubham Weds null");
		}
		finally
		{
			System.out.println("Shubham are Happy");
		}
		System.out.println("Shubham Kids");
	}
}