//WAP in java to check number is palindrome or not
import java.util.*;
class PalindromeNumber
{
	public static void main(String [] args)
	{
		int n,rem,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener a Number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}
}