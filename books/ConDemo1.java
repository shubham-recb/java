//WAP in java to default constructor execution process.
class ConDemo1
{
	int eid;
	String ename;
	double esal;
	void display()
	{
		//Printing instance variables value.
		System.out.println("*****Employee Details*****");
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Sallary:"+esal);
	}
	public static void main(String [] args)
	{
		//during object creation 0-arg cons executed then value are assigned
		ConDemo1 cn=new ConDemo1();
		cn.display();
	}
} 