//WAP in java to demonstrate non-static function
import java.util.*;
class FunDemo2
{
	int greatest(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		FunDemo2 fd2=new FunDemo2();
		int g=fd2.greatest(a,b);
		System.out.println("Greatest No="+g);
	}
}