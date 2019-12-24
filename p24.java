//WAP in java to find greatest number in two number using non static function
import java.util.*;
class p24
{
	public static void main(String [] args)
	{
		int a,b,g;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		p24 obj=new p24();
		g=obj.greate(a,b);
		System.out.println("Greatest number is="+g);
	}
	public int greate(int x,int y)
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
}
