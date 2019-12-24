//WAP in java to print sum of digit
import java.util.Scanner;
class sumdigit
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n,sum=0,mod;
		n=sc.nextInt();
		while(n>0)
		{
			mod=n%10;
			sum=sum+mod;
			n=n/10;
		}
		System.out.print("sum ="+sum);
	}
}