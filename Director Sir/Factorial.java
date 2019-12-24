//WAP in java to find factorial of any number
import java.util.*;
class Factorial
{
	public static void main(String [] args)
	{
			int i,fact=1,n;
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter a number : ");
			n=sc.nextInt();
			for(i=n;i>0;i--)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is="+fact);
	}
}