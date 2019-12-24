//WAP in java to take input from user in array and print value
import java.util.*;
class p13
{
	public static void main(String [] args)
	{
		int []arr=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five number: ");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Entered Number: ");	
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}