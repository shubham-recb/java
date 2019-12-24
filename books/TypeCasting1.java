//WAP in java to using type casting
class TypeCasting1
{
	public static void main(String [] args)
	{
		//implicit typecasting(up casting)
		byte b=120;
		int i=b;//[automatic conversion of byte-int]
		System.out.println(i);
		char ch='a';
		//int a=ch;//[automatic conversion of char to int]
		System.out.println((int)ch);
		long l1=20;
		float f=l1;//[automatic conversion of long to float]
		System.out.println(f);
	}
} 