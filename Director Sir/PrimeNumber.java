//WAP in java to check number is prime or not
import java.util.*;
class PrimeNumber
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		PrimeNumber pm=new PrimeNumber();
		pm.prime(n);
	}
	public void prime(int n)
	{
		int flag=0;
		int num=n;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("This is not prime number.");
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("This is prime number.");
		}
	}	
}