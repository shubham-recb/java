//WAp in java to find the facorial of user input number by command argument
import java.util.*;
class args3
{
	public static void main(String [] args)
	{
		int f=1,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			f=f*i;
		}
		System.out.println("Factorial of number is="+f);
	}
}