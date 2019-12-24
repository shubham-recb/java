class Animal
{
	void eating()
	{
		System.out.println("eating");
	}
	void moving()
	{
		System.out.println("moving");
	}
}
class Dog extends Animal
{
		void eating()
	{
		System.out.println("Dog is eating");
	}
	void barking()
	{
		System.out.println("Dog is barking");
	}
}
class TestCasting
{
	public static void main(String args[])
	{
		Animal a=new Dog();
		Dog d=(Dog)a;
		d.eating();
		//a.moving();
		//a.barking();
	}
}

