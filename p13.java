//WAP in java to take input from user in array and print value
import java.util.*;
class p13
{
	public static void main(String [] args)
	{
		int []x=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers to the list:");
		for(i=0;i<5;i++)
		{
			x[i]=sc.nextInt();	
		}
		System.out.println("YOu have entered following number");
		for(i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
	}
}