//WAP in java using exception handling
class ExDemo1
{
	public static void main(String [] args)
	{
		System.out.println("Shubham in 1st class");
		System.out.println("Shubham in 2nd class");
		System.out.println("Shubham in 10th class");
		System.out.println("Shubham in 12th class");
		System.out.println("Shubham in Diploma");
		System.out.println("Shubham become a software Engineer");
		try
		{
			System.out.println("Shubham weds Neha"+(10/0));
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Shubham weds Gauri");
		}
		finally
		{
			System.out.println("Shubham is happy");
		}
		System.out.println("Shubham two kids");
	}
}