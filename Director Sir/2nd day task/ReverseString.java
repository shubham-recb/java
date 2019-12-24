//WAP in java to reverse Stringimport 
import java.util.*;
class ReverseString
{
	public static void main(String [] args)
	{
		String name,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name : ");
		name=sc.nextLine();
		int n=name.length();
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.print("Reverse String="+reverse);
			
	}
}
