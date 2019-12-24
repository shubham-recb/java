class Box
{
	double height;
	double width;
	double length;
	void set(double l,double h,double w)
	{
		height=h;
		width=w;
		length=l;
	}
	void display()
	{
		System.out.println("Height="+height+"\nWidth="+width+"\nLength="+length);
	}
}
class p2
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.set(2.5,2.5,2.5);
		b.display();
	}
}