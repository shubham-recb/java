//WAP in java to find year, week, days
import java.util.*;
class Year
{
	public static void main(String [] args)
	{
		int days,year,month,week;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days numebr : ");
		days=sc.nextInt();
		year=days/365;
		days=days%365;
		month=days/30;
		days=days%30;
		week=days/7;
		days=days%7;
		System.out.println("Year="+year);
		System.out.println("Month="+month);
		System.out.println("Week="+week);
		System.out.println("Days="+days);
	}
}