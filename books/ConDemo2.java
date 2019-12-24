//WAP in java to user define 0-argument constructor execution process
class ConDemo2
{
	//instance variables
	int eid;
	String ename;
	int esal;
	ConDemo2()//user define 0-argument constructor
	{
		eid=111;
		ename="Shubham";
		esal=500000;
	}
	void display()
	{
		//printing instance variables values
		System.out.println("*****Employee Details*****");
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Sallary:"+esal);
	}
	public static void main(String [] args)
	{
		//during object creation 0-arg cons executed then values are assigned
		ConDemo2 cn=new ConDemo2();
		cn.display();
	}
}