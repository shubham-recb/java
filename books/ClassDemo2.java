//WAP in java to use of private access modifiers
class NewCar
{
	private String make;  //private data member.
	private String color;  //private data member.
	private int price;  //private data memner.
	public void setValue(String m,String c,int p)
	{
		make=m;
		color=c;
		price=p;
	}
	public void display()
	{
		System.out.println("New Car Make="+make);
		System.out.println("New Car Color="+color);
		System.out.println("New Car Price="+price);
	}
}
class ClassDemo2
{
	public static void main(String [] args)
	{
		NewCar nc=new NewCar();
		nc.setValue("TATA","Silver",1000000);
		nc.display();
	}
}