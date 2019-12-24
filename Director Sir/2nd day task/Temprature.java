//WAP in java to convert fohrenheite & celcious
import java.util.*;
class Temprature
{
	public static void main(String [] args)
	{
		double f,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temperatur in f : ");
		f=sc.nextDouble();
		c=(f-32)*5/9;
		System.out.println("Celcious = "+c);
		System.out.println("Enter temparetur in c :");
		c=sc.nextDouble();
		f=(9*c)/5+32;
		System.out.println("Fohrenheite ="+f);
	}
}