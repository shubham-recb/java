//WAp in java to find the facorial of user input number by command argument
class args4
{
	public static void main(String [] args)
	{
		int f=1,n,i;
		int argsLength=args.length;
		if(argsLength==1)
		{
			n=Integer.parseInt(args[0]);
			for(i=n;i>0;i--)
			{
				f=f*i;
			}
			System.out.println("Factorial of "+n+" is :"+f);
		}
		else if(argsLength>1)
		{
			System.out.println("More than one number is entered...");
		}
		else
		{
			System.out.println("No argument entered...");
		}
		
	}
}