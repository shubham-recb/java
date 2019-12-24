import java.util.Scanner;
class p5
{
	public static void main(String [] args)
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age: ");
		age=s.nextInt();
		if(age<=15)
		{
			System.out.println("You are Kid.");
		}
		else if(age>15 && age<=45)
		{
			System.out.println("You are Young");
		}
		else if(age>45 && age<=100)
		{
			System.out.println("You are old");
		} 
		else
		{
			System.out.println("You have crossed your age limit");
		}
		
	}
}
