//WAP in java to find sum of 10 number using array
import java.util.*;
class p14
{
	public static void main(String [] args)
	{
		int []x=new int[10];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers to the list:");
		for(i=0;i<=9;i++)
		{
			x[i]=sc.nextInt();
			sum=sum+x[i];
		}
		System.out.print("Sum="+sum);
	}
}