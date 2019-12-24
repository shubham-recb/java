//WAP in java to swap two number without using Third Variable
import java.util.*;
class SwapNumber
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("Enter Two number : ");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of A="+a);
		System.out.println("Value of B="+b);
	}
}
