 //WAP to test the prime number.
 import java.util.*;
 class PrimeNum
 {
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		PrimeNum pn=new PrimeNum();
		pn.prime(n);
	 }
	 public void prime(int n)
	 {
		 int flag=0;
		 int num=n;
		 for(int i=2;i<=num/2;i++)
		 {
			 if(num%i==0)
			 {
				 System.out.println("This is not prime number");
				 flag++;
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.println("This is a prime number");
		 }
	 }
 }