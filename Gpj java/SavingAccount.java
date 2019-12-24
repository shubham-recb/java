class SavingsAccountTester
{
	private double balance;
	private double interest;

	void SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	int SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	void deposit(double amount)
	{
		balance = balance + amount;
	}

	void withdraw(double amount)
	{
		balance = balance - amount;
	}

	void addInterest()
	{
		balance = balance + balance * interest;
	}

	double getBalance()
	{
		return balance;
	}

}
class SavingAccount
{
	public static void main(String[] args)
	{
		SavingsAccountTester jimmysSavings = new SavingsAccountTester(1000, 0.10);
		jimmysSavings.withdraw(250);
		jimmysSavings.deposit(400);
		jimmysSavings.addInterest();
		System.out.println(jimmysSavings.getBalance());
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}