//WAP in java using super keyword for invoke constructor of super class
class parent
{
	String name;
	public parent(String n)
	{
		name=n;
	}
}
class child extends parent
{
	String name;
	public child(String n1,String n2)
	{
		super(n1);
		this.name=n2;
	}
	public void display()
	{
		System.out.println(super.name+" and "+name);
	}
	public static void main(String args[])
	{
		child c=new child("parent","child");
		c.display();
	}
}