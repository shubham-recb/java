//how we access public instance variables
class Car
{
	public String make;//instance variables
	public String color;
	public long price;
}
class ClassDemo2
{
	public static void main(String [] args)
	{
		Car c=new Car();
		c.make="Mahindra";
		c.color="grey";
		c.price=8500000;
		System.out.println("Car make="+c.make);
		System.out.println("Car color="+c.color);
		System.out.println("Car price="+c.price);
	}
}