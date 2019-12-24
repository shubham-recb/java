//WAP in java using finalize() method
class p2
{
	public static void main(String args[])
	{
		p2 p=new p2();
		p.finalize();
		p=null;
		System.gc();
		System.out.println("Main Complete");
	}
	public void finalize()
	{
		System.out.println("Finalize method overiden");
		System.out.println(10/0);
	}
}