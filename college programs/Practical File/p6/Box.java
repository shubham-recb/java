 //WAP to create a simple class to find out the area and perimeter of rectangle and box using super and this keyword.
 class Rectangle
 {
	 int l,b;
	 public Rectangle()
	 {
		 l=2;
		 b=3;
	 }
	 public void area1()
	 {
		 System.out.println("Area of Rectangle = "+(l*b));
	 }
	 public void perimeter1()
	 {
		 System.out.println("Perimeter of Rectangle = "+2*(l+b));
	 }
 }
class Box extends Rectangle
{
	int l,b;
	public Box()
	{
		super();
		this.l=4;
		this.b=5;
	}
	 public void area()
	 {
		 System.out.println("Area of Rectangle1 = "+(l*b));
	 }
	 public void perimeter()
	 {
		 System.out.println("Perimeter of Rectangle1 = "+2*(l+b));
	 }
	public static void main(String args[])
	{
		Box b=new Box();
		b.area();
		b.area1();
		b.perimeter();
		b.perimeter1();
	}
}