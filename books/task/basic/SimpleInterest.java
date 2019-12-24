//WAp in java to find Simple interest
import java.util.*;
class SimpleInterest
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rate value : ");
		float r=sc.nextFloat();
		System.out.println("Enter timing : ");
		float t=sc.nextFloat();
		float n=r*t;
		System.out.println("Enter Principal Ammount : ");
		float p=sc.nextFloat();
		double si=p*(1+n);
		System.out.println("Simple Interest = "+si);
	}
}