import java.util.Scanner;
class Interest
{
	public static void main(String [] args)
	{
		float p,t,r,n;
		double si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rate value :");
		r=sc.nextFloat();
		System.out.println("Enter timing :");
		t=sc.nextFloat();
		System.out.println("Enter PRincipal Amount :");
		p=sc.nextFloat();
		n=r*t;
		si=p*(1+n);
		System.out.println("Simple Interest="+si);		
	}
}