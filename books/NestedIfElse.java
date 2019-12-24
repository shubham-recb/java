//WAP in java to find greatest number amoung three number
import java.util.*;
class NestedIfElse
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Greatest number is="+a);
			}
			else
			{
				System.out.println("Greatest Number is="+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Greatest Number is="+b);
			}
			else
			{
				System.out.println("Greatest Number is="+c);
			}
		}
	}
}