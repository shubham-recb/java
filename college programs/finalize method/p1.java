//WAP in java using finialize method.
class p1
{
	public static void main(String args[])
	{
		p1 p=new p1();
		p.finalize();
		p.finalize();
		p=null;
		System.gc();
		System.out.println("Main Complete");
	}
	public void finalize()
	{
		System.out.println("Finilize method overriden");
	}
}