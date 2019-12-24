//WAP in java to find max number in array
import java.util.*;
class MaxNumber
{
	public static void main(String [] args)
	{
		int []x=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number in array.");
		for(int i=0;i<10;i++)
		{
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println("Greatest Nmuber="+x[9]);
	}
}