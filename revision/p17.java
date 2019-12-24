//WAP in java to many string function length(),toUperCase(),toLowerCase();
import java.util.*;
class p17
{
	public static void main(String [] args)
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name: ");
		name=sc.nextLine();
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
	}
}