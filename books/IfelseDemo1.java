//WAP in java to find the greatest Number
import java.util.*;
class IfelseDemo1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Greatest No.="+a);
		}
		else
		{
			System.out.println("Greatest No.="+b);
		}
	}
}