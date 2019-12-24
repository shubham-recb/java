class Animal
{
	Animal()
	{
		System.out.println("This is animal class");
	}
}
class Dog extends Animal
{
	Dog()
	{
		System.out.println("this is dog class");
	}
}
class TestSuper
{
	public static void main(String args[])
	{
		Dog d=new Dog();
	}
}