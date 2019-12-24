//WAP in java to check number is prime or not
import java.util.Scanner;
class prime
{
	public static void main(String [] args)
	{
		int n,m=0,flag=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr a number for check prime : ");
		n=sc.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.print("Number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("Number is prime");
		}
	}
}