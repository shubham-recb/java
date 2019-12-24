class Vehicle
{
	void changeSpeed(final int a)
	{
		a=a+1;
		System.out.println("Vehicle is Speed"+a);
	}
}
class VTest
{
	public static void main(String args[])
	{
		Vehicle v =new Vehicle();
		v.changeSpeed(5);
	}
}
