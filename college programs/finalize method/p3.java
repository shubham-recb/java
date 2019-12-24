//WAP in java to using finalize() method
class p3
{
	public static void main(String args[])
	{
		p3 p=new p3();
		p=null;
		System.gc();
		System.out.println("Main Complete");
	}
	public void finalize()
	{
		System.out.println("finalize method overriden");
		System.out.println(10/0);
	}
}