class Rectangle
{
	int l,b;
	Rectangle()
	{
		l=2;
		b=3;
	}
	void area()
	{
		System.out.println("Area="+(l*b));
	}
	void perm()
	{
		System.out.println("Perimeter="+2*(l+b));
	}
}
class p4
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.area();
		r.perm();
	}
}