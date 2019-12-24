import java.util.*;
class SimpleInterest
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rate , time principal Ammount");
		float r=sc.nextFloat();
		float t=sc.nextFloat();
		float p=sc.nextFloat();
		double si=((p*t*r)/100);
		System.out.println("Simple Interest="+si);
	}
}