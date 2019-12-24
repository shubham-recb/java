//WAP in java using switch case
import java.util.Scanner;
class p6
{
	public static void main(String [] args)
	{
		double c,f;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 for c to f: ");
		System.out.print("Enter 2 for f to c: ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.print("Enter Temperature in c: ");
					c=sc.nextDouble();
					f=(9*c)/5+32;
					System.out.print("Temperature in f="+f);
					break;
			case 2:
					System.out.print("Enter Temperature in f: ");
					f=sc.nextInt();
					c=(f-32)*5/9;
					System.out.print("Temperature in c="+c);
		}
	}
}