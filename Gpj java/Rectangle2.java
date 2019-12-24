//WAP in java to find area and perimeter of rectangle by using this and super keyword.
class RectangleDemo2
{
	int length;
	int breadth;
	RectangleDemo2(int len,int bth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}
class Rect extends RectangleDemo2
{
	Rect(int length,int breadth)
	{
		super(length,breadth);
	}
	void display()
	{
		int area,peri;
		area=length*breadth;
		peri=2*(length+breadth);
		System.out.println("Area of Rectangle : "+area);
		System.out.println("Perimeter of Rectangle : "+peri);
	}
}
class Rectangle2
{
	public static void main(String args[])
	{
		RectangleDemo rd=new RectangleDemo(5,5);
		rd.display();
	}
}	