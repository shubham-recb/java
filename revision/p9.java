//WAP in java to print factorial of any number using for loop
import java.util.Scanner;
class p9
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number for find factorial");
		int n,i,f;
		f=1;
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			f=f*i;
			System.out.println("Factorial ="+f);
		}
	}
}