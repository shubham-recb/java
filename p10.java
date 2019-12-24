/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
class p10
{
	public static void main(String [] args)
	{
		int i,j;
		for(i=1;i<=5;i++)  //outer for loop
		{
			for(j=1;j>=i;j--)  //inner for loop
			{
				System.out.print(i+" ");	
			}	
			System.out.print("\n");
		}
	}
}