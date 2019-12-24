//WAP in java to print following pattern 1 to 100 number
class count100
{
	public static void main(String [] args)
	{
		int i,j,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=i;
			for(j=1;j<=10;j++)
			{
				System.out.print(sum+"\t");
				sum=sum+10;
			}
			System.out.print("\n");
		}
	}
}