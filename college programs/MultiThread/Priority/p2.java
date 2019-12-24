class CheckPriority extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		System.out.println("THread name is : "+name+"Priority : "+priority);
	}
	public static void main(String args[])
	{
		CheckPriority t1=new CheckPriority();
		CheckPriority t2=new CheckPriority();
		CheckPriority t3=new CheckPriority();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}