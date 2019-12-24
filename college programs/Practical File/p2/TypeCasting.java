// WAP to demonstrate widening type casting.
class TypeCasting
{
	public static void main(String args[])
	{
		int i=100;
		long l=i;
		float f=l;
		double d=f;
		System.out.println("Int Value : "+i);
		System.out.println("Long Value : "+l);
		System.out.println("Float Value : "+f);
		System.out.println("Double Value : "+d);
	}
}