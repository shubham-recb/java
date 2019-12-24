//WAP in java to find Fibonacci Sequence
import java.util.Scanner;
class fibonacci
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for find Fibonacci Sequence: ");
		int n1,n2,i,n3,n;
		n1=0;
		n2=1;
		n=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}