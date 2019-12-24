import java.util.*;
class RectAngle
{
	public static void main(String [] args)
	{
		float l,w,a,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length Value : ");
		l=sc.nextFloat();
		System.out.print("Enter Width value : ");
		w=sc.nextFloat();
		a=l*w;
		p=2*(l+w);
		System.out.println("Area of Rectangle = "+a);
		System.out.println("Perimeter of Rectangle = "+p);	
	}
}