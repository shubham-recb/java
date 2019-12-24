//WAP in java to demonstrate passing parameter & no return type
import java.util.*;
class FunDemo6
{
	void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("n*i");
		}
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		FunDemo6 fd6=new FunDemo6();
		System.out.println("Enter a number  for print table : ");
		int x=sc.nextInt();
		fd6.printTable(x);
	}
}