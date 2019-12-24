//WAP in java using ladder if-else
import java.util.Scanner;
class p5
{
	public static void main(String [] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your age: ");
		age=sc.nextInt();
		if(age<=15)
		{
			System.out.println("You are Kid");
		}
		else if(age>15 && age<=45)
		{
			System.out.println("You are Young");
		}
		else if(age>45 && age<=100)
		{
			System.out.println("YOU are old");
		}
		else
		{
			System.out.println("YOu have crossed 100 year");
		}
	}
}