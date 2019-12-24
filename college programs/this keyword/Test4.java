//WAP in java using this keyword to invoke to current class method
class Test4
{
	void display()
	{
		System.out.println("Inside Display Function");
		this.show();
	}
	void show()
	{
		System.out.println("Inside Show Function");
	}
	public static void main(String args[])
	{
		Test4 t=new Test4();
		t.display();
	}
}