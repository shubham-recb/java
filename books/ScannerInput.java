//WAP in java used to take dynamic input from user
import java.util.*;
class ScannerInput 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.nextLine();
		System.out.println("Enter your Id : ");
		int id=sc.nextInt();
		System.out.println("Enter your hobbies : ");
		String hb=sc.next();
		System.out.println("Enter your Salary : ");
		float sl=sc.nextFloat();
		System.out.println("********My Details******");
		System.out.println("My Name is :"+name);
		System.out.println("My id no is : "+id);
		System.out.println("My salary are : "+sl);
		System.out.println("My hobbies are : "+hb);
	}
}