//WAP in java to check three digit number is armstrong or not.

import java.util.*;
class Arm
{
public static void main(String[] args)
{
int digit,i,sum=0,cube,rem;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number: ");
digit=sc.nextInt();
for(i=digit;i>0;i=i/10)
{
rem=i%10;
cube=rem*rem*rem;
sum=sum+cube;
}
if(sum==digit)
{
System.out.println("no. is armstrong");
}
else
{
System.out.println("no. is not armstrong");
}
}
}