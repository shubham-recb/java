//A program to demonstate concept of non-static function
import java.util.*;
class p23
{
	public static void main(String [] args)
	{
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of cube:");
		s=sc.nextInt();
		p23 obj=new p23();
		obj.volume(s);	
	}
	public void volume(int s)
	{
		int v;
		v=s*s*s;
		System.out.println("Volume of cube="+v);
	}
}