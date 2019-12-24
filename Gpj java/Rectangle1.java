//WAP in java to find area and perimeter of rectangle by using this and super keyword.
class RectangleDemo
{
	int length;
	int breadth;
	RectangleDemo(int len,int bth)
	{
		this.length=len;
		this.breadth=bth;
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
class Rectangle1
{
	public static void main(String args[])
	{
		RectangleDemo rd=new RectangleDemo(10,5);
		rd.display();
	}
}	