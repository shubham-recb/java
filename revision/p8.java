//WAP in java to print table of any number using while loop
import java.util.Scanner;
class p8
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number for print table");
		int n,i,t;
		i=1;  //initialization
		n=sc.nextInt();
		while(i<=10)  //condition
		{
			t=n*i;
			System.out.println(n+"*"+i+"="+t);
			i++;  //updation
		}
	}
}