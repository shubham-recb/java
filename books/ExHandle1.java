import java.util.*;
class ExHandle1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numebr : ");
		int n=sc.nextInt();
		try
		{
		System.out.println(10/n);
		String str=null; 
		System.out.println("Your name is :"+str);
		System.out.println("Your name length is--->"+str.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("good boy zero not allowed getting exception"+ae);
		}
		catch(NullPointerException ne)
		{
			System.out.println("Good Girl getting Exception"+ne);
		}
		System.out.println("Rest of the code");
	}
}