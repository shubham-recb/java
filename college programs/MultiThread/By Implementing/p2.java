class MyThread extends Thread
{
		public void run()
		{
			System.out.println(Thread.currentThread().getName());
		}
		public static void main(String args[])
		{
			MyThread ob1=new MyThread();
			MyThread ob2=new MyThread();
			MyThread ob3=new MyThread();
			ob1.start();
			ob2.start();
			ob3.start();
			
		}
}