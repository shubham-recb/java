//WAP to create a thread that implement the Runable interface.
class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
	}
}