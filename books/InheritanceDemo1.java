//WAP in java to demonstrate of single inheritance
class RunDog
{
	public void bark()
	{
		System.out.println("Tommy.......");
		System.out.println("Bho.......Bho......");
	}
}
class BullDog extends RunDog
{
	public void grawl()
	{
		System.out.println("Tuffy........");
		System.out.println("Gurr.....Gurr.......");
	}
}
class InheritanceDemo1
{
	public static void main(String [] args)
	{
		BullDog dog=new BullDog();
		dog.bark();
		dog.grawl();
	}
}