 //WAP to design a string class that perform string  method (equals, reverse the string, change case).
class p11
{
	public static void main(String args[])
	{
		String s1="SHUBHAM";
		String s2="SHUBHAM";
		boolean res=s1.equals(s2);
		System.out.println("Result = "+res);
		String str=s1.toLowerCase();
		System.out.println("The word is in Lower Case = "+str);
		int length=s2.length();
		String reverse="";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+s2.charAt(i);
		}
		System.out.println("Reverse word = "+reverse);
	}
}