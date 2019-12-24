//WAP in java to find sum of English words
import java.util.*;
class Name
{
	String name;//instance variables
	Name(String s)//parameter constructor
	{
		name=s;
	}
	void display()
	{
		System.out.println("My Name is :"+name);
	}
}
class NameSum
{
	public static void main(String [] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		s=sc.nextLine();
		Name nm=new Name(s);
		nm.display();
	}
} 