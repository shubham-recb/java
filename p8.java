import java.util.Scanner;
class p8
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print the table:");
		int n,i,t;
		n=sc.nextInt();
		i=1;
		while(i<=10)
		{
			t=n*i;
			System.out.println(n+"*"+i+"="+t);
			i++;
		}
	}
}