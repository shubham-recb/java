/*WAP in java to print following pattern
1 
2 4
3 6 9
4 8 12 16
5 10 15 20 25
*/
class pattern1
{
	public static void main(String [] args)
	{
	int i,j,tab;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
				tab=i*j;
				System.out.print(tab+" ");
		}
		System.out.print("\n");
	}
	}
}