// WAP to design a class account using the inheritance and static that show all function of bank (withdrawal, deposit).  
import java.util.Scanner;
class Bank
{
	static int available;
	static void depositMoney(int submit)
	{
		available=available+submit;
		System.out.println("You have submmited "+submit);
		System.out.println("Now, you have "+available+" available in your account");
	}
	static void withdrawMoney(int money)
	{
		available=available-money;
		System.out.println("You hava withdrawn "+money);
		System.out.println("Now, you have "+available+" available in your account");
	}
}
class Account extends Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name=sc.nextLine();
		System.out.println("Enter the available money in your account");
		available=sc.nextInt();
		System.out.println("Hi "+name);
		System.out.println("You have "+available+" in your account");
		while(true)
		{
			System.out.println("Enter 1.Deposit");
			System.out.println("Enter 2.Withdraw");
			System.out.println("Enter 3.Exit");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
				{
					System.out.println("Enter the amount to deposit");
					int submit=sc.nextInt();
					Account.depositMoney(submit);
					break;
				}
				case 2:
				{
					System.out.println("Enter the amount to withdraw");
					int money=sc.nextInt();
					if(money>available)
					{
						System.out.println("You have "+available+" money only in your account");
					}
					else
					{
						Account.withdrawMoney(money);
					}
					break;
				}
				case 3:
				{
					System.out.println("Thank You");
					break;
				}
				default:
						System.out.println("Please enter either 1 or 2 number only");
						break;
			}
			if(n==3)
			{
				break;
			}
		}
	}
}