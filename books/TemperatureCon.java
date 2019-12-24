//WAp in java to convert temperature c to f & f to c using switch case
import java.util.*;
class TemperatureCon
{
	public static void main(String [] args)
	{
		double c,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for c to f");
		System.out.println("Enter 2 fro f to c");
		int a=sc.nextInt();
		switch(a)
		{
			case 1:System.out.println("Enter Temperature in c:");
					c=sc.nextDouble();
					f=(9*c)/5+32;
					System.out.println("Temperature in f="+f);
			break;
			case 2:System.out.println("Enter Temperature in f:");
					f=sc.nextDouble();
					c=(f-32)*5/9;
					System.out.println("Temperature in f="+c);
			break;
			default:System.out.println("Invalid Choice");
			break;
		}
	}
}