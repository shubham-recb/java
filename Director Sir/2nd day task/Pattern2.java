/*WAP in java to print following Pattern
A B C
D E
F
*/
class Pattern2
{
	public static void main(String [] args)
	{
		int i,j;
		for(i=65;i>=67;i++)
		{
			for(j=65;j<i-2;j++)	
			{
				System.out.print((char)j+" ");
			}
			System.out.print("\n");
		}
	}
}