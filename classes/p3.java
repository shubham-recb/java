class Employee
{
	String name;
	int empid;
	Employee()
	{
		name="Shubham";
		empid=101;
	}
	void display()
	{
		System.out.println("Emp-Id="+empid+"\tEmp-Name="+name);
	}
}
class p3
{
	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.display();
	}
}