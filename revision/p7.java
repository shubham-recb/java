//WAP in java to print even number from 1 to 100 using while loop
class p7
{
	public static void main(String [] args)
	{
		int c;
		c=1;  //Initialization
		while(c<=100)   //Conditoin
		{
			if(c%2==0)
			{
				System.out.print(c+"\t");
			}
			c++;  //Updation
		}
	}
}