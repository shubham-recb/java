public class PublicMethod
{
	public int aMethod()
	{
		static int i=0;
		i++;
		return i;
	}
	public static void main(String [] args)
	{
		PublicMethod pm=new PublicMethod();
		pm.aMethod();
		int j=pm.aMethod();
		System.out.println(j);
	}
}