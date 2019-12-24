//WAP in java to find volume & Surface Area of Cuboid
import java.util.*;
class SAreaCuboid
{
	public static void main(String [] args)
	{
		int l,b,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of cuboid : ");
		l=sc.nextInt();
		System.out.println("Enter Breath of Cuboid : ");
		b=sc.nextInt();
		System.out.println("Enter Height of Cuboid : ");
		h=sc.nextInt();
		int v=l*b*h;
		int sa=2*(l*b+b*h+h*l);
		System.out.println("Volume of Cuboid = "+v);
		System.out.println("Surface Area of Cuboid = "+sa);
	}
}