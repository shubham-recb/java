//WAP in java to Calculate Simple Interest.
import java.util.*;
class SimpleInterest
{
	public static void main(String args[])
	{
		int p,r,t,si;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 'Principle' : ");
		p=sc.nextInt();
		System.out.print("\nEnter 'Rate' : ");
		r=sc.nextInt();
		System.out.print("\nEnter 'Time' : ");
		t=sc.nextInt();
		si=(p*r*t)/100;
		System.out.println("Simple Interest  : "+si);
	}
}