//WAP in java to find sum of digit of givaen number
import java.util.*;
class SumDigit
{
	public static void main(String [] args)
	{
		int n,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digit="+sum);
	}
}