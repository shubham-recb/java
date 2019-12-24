//WAP in java to create a calculator
import java.util.*;
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Choose Operator : ");
		System.out.println("1 for Sum");
		System.out.println("2 for Sub");
		System.out.println("3 for mult");
		System.out.println("4 for div");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
					int sum=n1+n2;
					System.out.println("Sum="+sum);
					break;
			case 2:
					int sub=n1-n2;
					System.out.println("Sum="+sub);
					break;
			case 3:
					int mult=n1*n2;
					System.out.println("Sum="+mult);
					break;
			case 4:
					int div=n1/n2;
					System.out.println("Sum="+div);
					break;
			default:
					System.out.println("Please valid chosse number");
		}
	}
}