class Box
{
	double height;
	double width;
	double length;
}
class p1
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.length=2.5;
		b.width=2.5;
		b.length=2.5;
		System.out.println("Length="+b.length+"Width="+b.width+"Height="+b.height);
	}
}