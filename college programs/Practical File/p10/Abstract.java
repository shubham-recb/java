//WAP to desing a class using abstract methods and classes. 
abstract class Example
{
	abstract void display();
}
class Abstract extends Example
{
	void display()
	{
		System.out.println("This is implementation of abstract method");
	}
	public static void main(String arg[])
	{
		Example am=new Abstract();
		am.display();
	}
}
