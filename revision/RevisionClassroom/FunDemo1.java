//WAP in java to usung static function
import java.util.*;
class FunDemo1
{
	static int volume(int s)
	{
		return(s*s*s);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side of cube : ");
		int x=sc.nextInt();
		int v=volume(x);
		System.out.print("Volume of cube="+v);
	}
}