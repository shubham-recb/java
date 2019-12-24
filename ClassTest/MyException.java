//WAP in java to crate our exception subclass than throws exception if the sum of two number is greter than 99.
import java.util.Scanner;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
	public static void main(String args[])
	{
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b : ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		try
		{
			if(sum>99)
			{
				throw new MyException("Sum is greater than 99");
			}
			else
			{
				System.out.println("sum<99");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}