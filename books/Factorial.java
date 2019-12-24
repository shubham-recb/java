//WAP in java to find factorial of given number
import java.util.*;
class Factorial
{
	public static void main(String [] args)
	{
		int n,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
			System.out.println("Factorial of given number="+fact);
	}
}