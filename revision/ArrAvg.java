//WAP in java to find avg of 10 number using array
import java.util.*;
class ArrAvg
{
	public static void main(String [] args)
	{
		int []arr=new int[10];
		int i,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number: ");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=sum/10;
		System.out.println(avg);
	}
}