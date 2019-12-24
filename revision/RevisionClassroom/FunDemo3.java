//WAP in java using static function, find simple interest
import java.util.*;
class FunDemo3
{
	static double  interest(float n,float p,float r)
	{
		return((p*n*r)/100);
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rate value : ");
		float r=sc.nextFloat();
		System.out.println("Enter time: ");
		float n=sc.nextFloat();
		System.out.println("Enter principal Ammount : ");
		float p=sc.nextFloat();
		double si=interest(r,n,p);
		System.out.println("Simple Interest="+si);
	}
}