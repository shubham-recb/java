class MyThread implements Runnable 
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		MyThread ob=new MyThread();
		Thread t=new Thread(ob);
		t.start();
	}
}