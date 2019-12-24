/* 
*
* *
* * *
*/
class Pattern2
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=3;i<0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}