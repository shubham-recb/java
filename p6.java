//Temperature Converter
import java.util.Scanner;
class p6
{
	public static void main(String [] args)
	{
	double c,f;
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for c to f");
	System.out.println("Enter 2 for f to c");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
			System.out.print("Enter temperature in c: ");
			c=sc.nextDouble();
			f=(9*c)/5+32;
			System.out.println("Temperature in f="+f);
			break;
		case 2:
			System.out.print("Enter temperature in f: ");
			f=sc.nextDouble();
			c=(f-32)*5/9;
			System.out.println("Temperature in c="+c);
			break;
		default:
			System.out.println("Invalid choice");
			break;
	}
	}
}