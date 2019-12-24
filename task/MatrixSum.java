//WAP in java to add two matrix.
import java.util.*;
class MatrixSum
{
	public static void main(String [] args)
	{
		int [][]x=new int[3][3];
		int [][]y=new int[3][3];
		int [][]sum=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 9 number for first matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 9 number for Second matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=x[i][j]+y[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}