//WAP in java to find the area of rectangle
import java.util.*;
class RectTest
{
	public static void main(String [] args)
	{
		int l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght & breadth of rectangle : ");
		l=sc.nextInt();
		b=sc.nextInt();
		RectTest rt=new RectTest();
		area=rt.GetRectArea(l,b);
		System.out.println("Area of Rectangle="+area);
	}
	public int GetRectArea(int l,int b)
	{
		return(l*b);
	}
}