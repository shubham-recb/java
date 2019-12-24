//A program to demonstrte concept of static function
import java.util.*;
class p22
{
	static int add(int x,int y)
	{
		return(x+y);
	}
	public static void main(String [] args)
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=add(a,b);
		System.out.println("Summition="+sum);
	}
}