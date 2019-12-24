//WAP in java to take user full name as input & dispaly short name
import java.util.*;
class shortname
{
	public static void main(String [] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		str=sc.nextLine();
		System.out.println(str);
		String []words=str.split(" ",3);
		System.out.println("Your short name is:"+words[0].charAt(0)+"."+words[1].charAt(0)+" "+words[2]);
	}
}