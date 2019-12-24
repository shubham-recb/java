//WAP in java to using super keyword for invoke super class method from sub-class method
class parent
{
	String name;
	public void display()
	{
		name="Parent Shubham";
		System.out.println(name);
	}
}
class child extends parent
{
	String name;
	public void display()
	{
		super.display();
		name="Child Shubham";
		System.out.println(name);
	}
	public static void main(String args[])
	{
		child c=new child();
		c.display();
	}
}