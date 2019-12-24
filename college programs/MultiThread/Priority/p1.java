class CheckPriority extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		CheckPriority t1=new CheckPriority();
		CheckPriority t2=new CheckPriority();
		CheckPriority t3=new CheckPriority();
		t1.start();
		t2.start();
		t3.start();
	}
}