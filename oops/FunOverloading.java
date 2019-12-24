import java.util.*;
class Shapes
{
	public int area(int s)
	{
		return(s*s);
	}
	public int area(int l,int b)
	{
		return(l*b);
	}
	public double area(float r)
	{
		return(3.14*r*r);
	}
}
class FunOverloading
{
	public static void main(String [] args)
	{
		int s,l,b,a1,a2;
		float r;
		double a3;
		Scanner sc=new Scanner(System.in);
		Shapes sh=new Shapes();
		System.out.println("Enter side of square: ");
		s=sc.nextInt();
		a1=sh.area(s);
		System.out.println("Area os square="+a1);
		System.out.println("Enter length & breath  of Rectangle: ");
		l=sc.nextInt();
		b=sc.nextInt();
		a2=sh.area(l,b);
		System.out.println("Area os square="+a2);
		System.out.println("Enter radius of circle: ");
		r=sc.nextFloat();
		a3=sh.area(r);
		System.out.println("Area os square="+a3);
	}
}