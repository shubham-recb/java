class Vehicle{
	final int a=5;
	final void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	final void run()
	{
		System.out.println("Bike is running");
	}
	public static void main(String args[]){
	Bike b=new Bike();
	b.run();
	}
}