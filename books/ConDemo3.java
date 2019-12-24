//WAP in java using user defined parameterized constructor
class ConDemo3
{
	//instance variables
	int eid;
	String ename;
	int esal;
	ConDemo3(int x,String y,int z)//parameterized constructor
	{
		eid=x;
		ename=y;
		esal=z;
	}
	void display()
	{
		//printing instance variables values
		System.out.println("*****Employee Details*****");
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Sallary:"+esal);
	}
	public static void main(String [] args)
	{
		//during object creation parameterized constructor executed
		ConDemo3 ca=new ConDemo3(111,"Pancham",100000);
		ca.display();
		ConDemo3 cb=new ConDemo3(112,"Shivam",100000);
		cb.display();
		ConDemo3 cc=new ConDemo3(113,"Shubham",100000);
		cc.display();
		
	}
} 