// WAP to find the factorial of a given number using Recursion.
import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		Factorial ft=new Factorial();
		res=ft.fact(n);
		System.out.println("Factorial of "+n+" : "+res);
	}
	int fact(int x)
	{
		if(x>1)
		{
			return(x*fact(x-1));
		}
		return 1;
	}
}