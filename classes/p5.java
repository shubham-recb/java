class Student
{
	String name;
	int rollno;
	Student(String n,int r)
	{
		name=n;
		rollno=r;
	}
	void print()
	{
		System.out.println("Name="+name+"\tRollno="+rollno);
	}
}
class p5
{
	public static void main(String args[])
	{
		Student s=new Student("Shubham",101);
		s.print();
	}
}