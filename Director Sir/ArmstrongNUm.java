//WAP in java to check number is armstrong or not
import java.util.*;
class ArmstrongNum
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		ArmstrongNum am=new ArmstrongNum();
		am.arm(n);
	}
	public void arm(int n)
	{
		int rem,sum=0,cube,temp;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("This is Armstrong Number.");
		}
		else
		{
			System.out.println("This is not Armstrong Number.");
		}
	}
}