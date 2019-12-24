class pattern3
{
	public static void main(String [] args)
	{
		int i,j;
		char ch='A';
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.print("\n");
		}
	}
}	
	