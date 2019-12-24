 //WAP to handle the exception using try and multiple catch block.
 class MultipleCatch
 {
	 public static void main(String args[])
	 {
	 int a[]={5,6};
		try
		{
			a[4]=a[1]/0; 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("End of the code");
	 }
 }