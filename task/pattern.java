/*WAP i java to find following pattern
A
B B
C C C
D D D D
E E E E E
*/
class pattern
{
	public static void main(String [] args)
	{
		char i,j;
		for(i=65;i<=69;i++)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print((char)i+" ");
			}
			System.out.print("\n");
		}
	}
}