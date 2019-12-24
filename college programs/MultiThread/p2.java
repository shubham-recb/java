class CurrentThread
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		t.setName("Main Thread");
		System.out.println("Name of thread is : "+t);
	}
}