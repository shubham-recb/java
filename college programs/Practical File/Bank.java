import java.util.*;
class Account
{
	static int sum;
	static void deposite(int amount)
	{
			
			sum=sum+amount;
			System.out.println("You have deposit"+amount);
			System.out.println("Your available balance : "+sum);
	}
	static void withdrawal(int money)
	{
				if(money>sum)
				{
					sum=sum-money;
					System.out.println("Your available balance : "+sum);
				}
				else
				{
					System.out.println("There are no balance"+money+"in your accont");
				}
	}
}
class Bank extends Account
{
	public static void main(String args[])
	{
		int acno,am,de;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your PIN");
		acno=sc.nextInt();
		System.out.println("Enter your total money"+sum);
		sum=sc.nextInt();
		while(acno==1234)
		{
			System.out.println("Welcome in the Banking Services");
			System.out.println("Select Your Option");
			System.out.println("1.Deposite\t2.Withdwawal\t3.Exit");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
				{
					System.out.println("Enter Amount");
					de=sc.nextInt();
					deposite(de);
					break;
				}
				case 2:
				{
					System.out.println("Enter Amount");
					am=sc.nextInt();
					if(am<sum)
					{
						System.out.println("Sorry,entered extra amount");
						System.out.println("Availble balance "+sum);
					}
					else
					{
						withdrawal(am);
					}
					break;
				}
				case 3:
				{
					System.out.println("Exit");
					break;
				}
				default:
				{
					System.out.println("Invalid Pin");
					break;
				}
			}
			if(n==3)
			{
				break;
			}
		}
	}
}