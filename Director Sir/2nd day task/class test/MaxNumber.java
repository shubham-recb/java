import java.util.*;
class MaxNumber
{
	public static void main(String [] args)
	{
		int []x=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter !0 number in Array : ");
		for(int i=0;i<10;i++)
		{
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println("Max Number="+x[9]);
	}
}