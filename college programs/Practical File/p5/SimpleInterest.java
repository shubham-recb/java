 //WAP to calculate the simple interest and input by users.
 import java.util.*;
 class SimpleInterest
 {
	 static double interest(float n,float p,float r)
	 {
		 return((p*r*n)/100);
	 }
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rate value : ");
		float r=sc.nextFloat();
		System.out.println("Enter time : ");
		float n=sc.nextFloat();
		System.out.println("Enter Principle Ammount : ");
		float p=sc.nextFloat();
		double si=interest(n,p,r);
		System.out.println("Simple Interest = "+si);
	 }
	 
 }