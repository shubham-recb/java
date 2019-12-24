//WAP in java to find area & perimaeter of rectangle using parameterized constructor
import java.util.*;
class Rect
{
	private int l,b;//private data member
	Rect(int x,int y)
	{
		l=x;
		b=y;
	}
	public int area()
	{
		return(l*b);
	}
	public int perimeter()
	{
		return(2*(l+b));
	}
}
class Rectangle
{
	public static void main(String [] args)
	{
		int x,y,a,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of length & breath:");
		x=sc.nextInt();
		y=sc.nextInt();
		Rect re=new Rect(x,y);//parameterized constructor
		a=re.area();
		p=re.perimeter();
		System.out.println("Area of Rectangle="+a);
		System.out.println("Perimeter of Rectangle="+p);
	}
}