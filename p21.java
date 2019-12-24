//WAP in java to find vowel counter
import java.util.*;
class p21
{
	public static void main(String [] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		str=sc.nextLine();
		int i,vc=0,a=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				vc++;
			}	
		}
		System.out.println("No.of vowels="+vc);
	}
}