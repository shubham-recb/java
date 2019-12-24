//wap in java to find sum of 10 number using array
import java.util.*;
class p14
{
	public static void main(String [] args)
	{
		int []arr=new int[10];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number: ");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of number is="+sum);
	}
}