class CommondLine1
{
	public static void main(String [] a)
	{
		System.out.println("Enter two number by commond line : ");
		int s=0;
		for(int i=0; i<a.length;i++)
		{
			s=s+Integer.parseInt(a[i]);
		}
		System.out.println("Sum is="+s);
	}
}