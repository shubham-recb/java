//WAP in java to print fibonacci sequence
import java.util.*;
class FibonacciSeq
{
	public static void main(String [] args)
	{
		int n1=0,n2=1,n3=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}
} 