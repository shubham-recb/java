//WAP in java to using super keyword for different sub-class & super class member.
class Parent
{
	String name;
}
class Child extends Parent
{
	String name;
	public void display()
	{
		super.name="Parent";
		name="Child";
		System.out.println(super.name+" and "+name);
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}
}