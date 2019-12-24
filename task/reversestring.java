//WAP in jav to trverse the given string
import java.util.*;
class reversestring
{
	public static void main(String [] args)
	{
		String str,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name:");
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String are:"+reverse);
	}
}
