//WAP to find factorial any number using function passing parameter.


import java.util.*;
class factorial
{
public static void main(String[]arr)
{
Scanner s1=new Scanner(System.in);
 int res=1;
System.out.print("Enter the number you want to factorial");
int num=s1.nextInt();
for(int i=num;i<0;i--)
{
int res=res*i;
}
System.out.println("The factorial is="res);
}
}
