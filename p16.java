//WAP in java to find greatest number between 10 number
import java.util.*;
class p16
{
	public static void main(String [] args)
	{
		int []list=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number to the list:");
		for(i=0;i<10;i++)
		{
			list[i]=sc.nextInt();
		}
		
		Arrays.sort(list);
		System.out.println("Smallest Number="+list[0]);
		System.out.println("Greatest number="+list[9]);
	}
}