//WAP in java find volume of cuboid using no parameter & retyrn type
import java.util.*;
class FunDemo5
{
	static int volume()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length, breadth, height of Cuboid : ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int v=l*b*h;
		return v;
	}
	public static void main(String [] args)
	{
		int v=volume();
		System.out.println("Volume of Cuboid="+v);
	}
}