//WAP in java to find Fibonacci Seq of given number
import java.util.*;
class FibonacciSeq
{
	public static void main(String [] args)
	{
		int n,n1=0,n2=1,n3,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		System.out.print(n1+"\t");
		System.out.print(n2+"\t");
		for(i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
		}
	}
}