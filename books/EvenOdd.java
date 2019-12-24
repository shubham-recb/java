//WAP in java to check number is even or odd
import java.util.*;
class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The Number "+num+" is Even.");
		}
		else
		{
			System.out.println("The number "+num+" is Odd.");
		}
	}
}