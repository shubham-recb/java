//WAP to demonstrate Narrowing type casting.
class TypeCasting1
{
	public static void main(String args[])
	{
		double d=100.05;
		long l=(long)d;
		int i=(int)l;
		System.out.println("Double value : "+d);
		System.out.println("Long value : "+l);
		System.out.println("Int value : "+i);
	}
}