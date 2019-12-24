import java.util.*;
class StringDemo1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a string : ");
		str=sc.nextLine();
		String ucase=str.toUpperCase();
		System.out.println(ucase);
		String lcase=str.toLowerCase();
		System.out.println(lcase);
		int l=str.length();
		System.out.println(l);
		System.out.println((str.charAt(0)+"").toUpperCase());
	}
}