//WAP in java to print sum of number who is input by user
class args2
{
	public static void main(String [] args)
	{
		int i,s=0;
		for(i=0;i<args.length;i++)
		{	
			s=s+Integer.parseInt(args[i]);
		}
			System.out.println("Sum is="+s);
	}
}