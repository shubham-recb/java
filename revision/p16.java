//WAP in java to find greatest number betwwen 10 number
import java.util.*;
class p16
{
	public static void main(String [] args)
	{
		int []arr=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number: ");
		for(i=1;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Smallest number is="+arr[0]);
		System.out.println("Greatest number is="+arr[9]);
	}
}