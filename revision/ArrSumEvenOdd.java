//WAP in java to find sum of even & odd number
import java.util.*;
class ArrSumEvenOdd
{
	public static void main(String [] args)
	{
		int []list=new int[10];
		int i,Esum=0,Osum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number: ");
		for(i=0;i<10;i++)
		{
			list[i]=sc.nextInt();
			if(list[i]%2==0)
			{
				Esum=Esum+list[i];
			}
			else
			{
				Osum=Osum+list[i];
			}
		}
		System.out.println("Sum of Even number="+Esum);
		System.out.println("Sum of Odd number="+Osum);
	}
} 