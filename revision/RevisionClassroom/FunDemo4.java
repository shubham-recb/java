//WAP in java to using no parameter & n retyrn type
import java.util.*;
class FunDemo4
{
	static void sayHello()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your name : ");
		String name=sc.nextLine();
		System.out.println("Hello! "+name);
	}
	public static void main(String [] args)
	{
		sayHello();
	}
} 