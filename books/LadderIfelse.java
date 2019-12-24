//WAp in jav to calculate the elecricity bill.
import java.util.Scanner;
class LadderIfelse
{
	public static void main(String [] args)
	{
		double bill=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of units consumed : ");
		int unit=sc.nextInt();
		if(unit<=150)
		{
			bill=unit*2.40;
		}
		else if(unit>=150 && unit<=300)
		{
			bill=(150*2.40)+(unit-150)*3.00;
		}
		else
		{
			bill=(150*2.40)+(150*3.00)+(unit-300)*3.20;
		}
		System.out.println("Your Bill="+bill);
	}
}