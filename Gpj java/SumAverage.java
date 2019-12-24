//WAP in java to find the sum and average of n numbers (by command line arguement).
class SumAverage
{
	public static void main(String args[])
	{
		int i,sum=0;
		for(i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+sum/i);
	}
}