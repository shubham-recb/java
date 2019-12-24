//WAP in java to print even number from 1 to 100
class p7
{
	public static void main(String [] args)
	{
		int c,sum=0;
		c=1;  //Initilization of loop control.
		while(c<=100)  //Condition
		{
			if(c%2==0)
			{
				System.out.print(c+"\t");
			}
			c++;   //Increment loo counter.
		}
	}
}