class RunDog
{
	public void bark()
	{
		System.out.println("Moti.........");
		System.out.println("Bhow.....Bhow......");
	}
}
class BullDog extends RunDog
{
	public void grawl()
	{
		System.out.println("Tuffy.......");
		System.out.println("Gurr.......Gurr......");
	}
}
class InheritanceDemo1
{
	public static void main(String [] args)
	{
		BullDog bg=new BullDog();
		bg.bark();
		bg.grawl();
	}
}