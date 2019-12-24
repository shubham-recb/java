//WAP in java to find factorial of given number
import java.util.Scanner;
class p9
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n,f=1,i;
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			f=f*i;
			System.out.println("Factorial="+f);
		}
	}
}