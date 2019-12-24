//WAP in java to represent Bank Account
class BankDetails
{
	//datamembers
	String nod;
	int acnum;
	String toac;
	int biac;
	BankDetails(String a,int b, String c, int d)
	{
		nod=a;
		acnum=b;
		toac=c;
		biac=d;
	}
	void display()
	{
		System.out.println("Name of the depositer:"+nod);
		System.out.println("Account Number:"+acnum);
		System.out.println("Type of Account:"+toac);
		System.out.println("Balance Ammount in Account:"+biac);
	}
}
class Bank
{
	public static void main(String [] args)
	{
		int a,b,c,d;
		BankDetails bd=new BankDetails("Shubham",1213123,"General",500000);
		bd.display();
	}
}