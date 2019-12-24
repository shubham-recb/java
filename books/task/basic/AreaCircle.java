//WAP in java to find area & perimeter of circle
import java.util.*;
class AreaCircle
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		int r=sc.nextInt();
		double a=3.14*r*r;
		double p=2*3.14*r;
		System.out.println("Area of Circle = "+a);
		System.out.println("Perimeter of Circle = "+p);
	}
}