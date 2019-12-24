//WAP in java to check String are  palindrome or not
import java.util.*;
class palinString
{
	public static void main(String [] args)
	{
		String str,str1="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name: ");
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str1.equalsIgnoreCase(str))
		{
			System.out.println("String are palindrome.");
		}
		else
		{
			System.out.println("String are not palindrome.");
		}
	}
}