//WAP in jav to find roots of Quadratic Equation
import java.util.*;
//import java.util.Math;
class QuadEquation
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A : ");
		double a=sc.nextDouble();
		System.out.println("Enter value of B : ");
		double b=sc.nextDouble();
		System.out.println("Enter value of C : ");
		double c=sc.nextDouble();
		double dis=Math.pow(b,2)-4*a*c;
		if(dis<0)
		{
			System.out.println("Roots are imaginary");
		}
		else
		{
			double Root1=(-b+Math.sqrt(dis))/(2*a);
			double Root2=(-b-Math.sqrt(dis))/(2*a);
			System.out.println("Roots1="+Root1);
			System.out.println("Roots2="+Root2);
		}
	}
}