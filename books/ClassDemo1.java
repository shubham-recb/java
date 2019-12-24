//WAP in java to use of public access specifier
class Car
{
	public String make;   //Data member
	public String color;  //data Member
	public int price;   //Data Member
}
class ClassDemo1
{
	public static void main(String [] args)
	{
		Car c=new Car();
		c.make="Mahindra";
		c.color="Grey";
		c.price=8000000;
		System.out.println("Car make="+c.make);
		System.out.println("Car color="+c.color);
		System.out.println("Car price="+c.price);
	}
}