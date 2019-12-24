//WAP in java to find the largest & Smallest Number in an array.
import java.util.*;
class Array
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
		Arrays.sort(x);
		System.out.println("Smallest Number="+x[0]);
		System.out.println("Largets Number="+x[x.length-1]);
	}
}