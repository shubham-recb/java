import java.util.*;
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two number : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Choose option");
		System.out.println("1 for Sum");
		System.out.println("2 for sub");
		System.out.println("3 for mult");
		System.out.println("4 for div");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("Sum="+(n1+n2));
			break;
			case 2:
			System.out.println("Sub="+(n1-n2));
			break;
			case 3:
			System.out.println("Mult="+(n1*n2));
			break;
			case 4:
			System.out.println("Div="+(n1/n2));
			break;
			default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
}