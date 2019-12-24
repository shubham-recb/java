//WAP in java to print the table of any number
import java.util.*;
class Table
{
	public static void main(String [] args)
	{
		int n,i,table;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			table=n*i;
			System.out.println(n+"*"+i+"="+table);
		}
		
	}
}