abstract class Vehicle{
	abstract void run();
}
class Bike extends Vehicle{
	void run()
	{
		System.out.println("Bike is running");
	}
}
class TestAbstraction{
	public static void main(String args[]){
	Bike b=new Bike();
	b.run();
	}
}
