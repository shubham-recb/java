//WAP in java to take input from user
import java.util.Scanner;
class p3
{
	public static void main(String [] args)
	{
		int n1,n2,sum,sub,mult,div;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		n1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		n2=sc.nextInt();
		sum=n1+n2;
		sub=n1-n2;
		mult=n1*n2;
		div=n1/n2;
		System.out.println("Summition ="+sum);
		System.out.println("Subtraction ="+sub);
		System.out.println("Multiplication ="+mult);
		System.out.println("Division ="+div);
	}
}