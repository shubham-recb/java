//WAP in java to check number even or odd
import java.util.Scanner;
class p4
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}