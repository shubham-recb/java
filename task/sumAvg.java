//WAP in java to enter 10 number in Array and find the average of those number
import java.util.*;
class sumAvg
{
	public static void main(String [] args)
	{
		int []list=new int[10];
		float sum=0;
		float avg;
		System.out.println("Enter 10 number an array: ");
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<list.length;i++)
		{
			list[i]=s1.nextInt();
			sum=sum+list[i];
		}
		avg=(sum/10);
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}
}