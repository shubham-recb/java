//Object:- Encrypt and Decrypt the message using caesar cipher.
import java.util.*;
class CipherText
{
	public static void main(String args[])
	{
		String ct="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your plane Text : ");
		String pt=sc.nextLine();
		System.out.println();
		System.out.print("Enter a keys to encrypt planetext : ");
		int key=sc.nextInt();
		for(int i=0;i<pt.length();i++)
		{
			int ascii=(int)pt.charAt(i);
			ascii=ascii+key;
			ct=ct+Character.toString((char)ascii);
			
		}
		System.out.println();
		System.out.println("After encryption Your cipher text is : "+ct);
		String planetext="";
		for(int i=0;i<ct.length();i++)
		{
			int ascii=(int)ct.charAt(i);
			ascii=ascii-key;
			planetext=planetext+Character.toString((char)ascii);
		}
		System.out.println();
		System.out.print("After decryption Your planetext text is : "+planetext);
	}
}