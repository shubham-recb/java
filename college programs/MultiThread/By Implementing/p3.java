class CheckState extends Thread
{
		public void run()
		{
			System.out.println("Run Thread");
		}
		public static void main(String args[])
		{
			CheckState t1=new CheckState();
			CheckState t2=new CheckState();
			System.out.println("t1 State : "+t1.getState());
			System.out.println("t2 State : "+t2.getState());
			t1.start();
			System.out.println("t1 State : "+t1.getState());
			System.out.println("t2 State : "+t2.getState());
			t2.start();
			System.out.println("t1 State : "+t1.getState());
			System.out.println("t2 State : "+t2.getState());
		}
}