//WAP in java to find simple interest
import java.util.*;
class SimpleInterest
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rate, time Principa ammount");
		float r=sc.nextFloat();
		float t=sc.nextFloat();
		float p=sc.nextFloat();
		double si=((p*r*t)/100);
		System.out.println("Simple Interest="+si);
	}
}