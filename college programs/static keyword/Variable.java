//WAP in java to using static keyword for a static variable
class Variable
{
	static int count=0;
	Variable()
	{
		++count;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Variable v1=new Variable();
		Variable v2=new Variable();
		Variable v3=new Variable();
	}
}