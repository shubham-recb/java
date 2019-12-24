//WAP in java to find of interst with parameterized constructor
import java.util.*;
class FindInt
{
	private float p,r,t;//private data member
	FindInt(float x,float y,float z)
	{
		p=x;
		r=y;
		t=z;
	}
	void simpleInterest()
	{
		float n,si;
		n=r*t;
		si=p*(1+n);
		System.out.println("Simple Interest="+si);
	}
}
class Interest
{
	public static void main(String [] args)
	{
		float x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("******Simple Inerest******");
		System.out.println("Enter Rate Value:");
		x=sc.nextFloat();
		System.out.println("Enter Timing.....");
		y=sc.nextFloat();
		System.out.println("Enter Principal Ammount:");
		z=sc.nextFloat();
		FindInt fi=new FindInt(x,y,z);
		fi.simpleInterest();
	}
}