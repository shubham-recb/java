import java.util.*;
class ExDemo2
{
	public static void main(String [] args)
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number :");
		try
		{
		x=sc.nextInt();
		y=sc.nextInt();
		z=x/y;
		System.out.println("Result="+z);
		}
		catch(InputMismatchException ex1)
		{
			System.out.println("Enter number only");
		}
		catch(ArithmeticException ex2)
		{
			System.out.println("The second number can't zero");
		}
		finally
		{
			System.out.println("Bye....Bye.......");
		}
	}
}
