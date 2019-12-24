//WAP in java to find surface area of cuboid usinf function(return value with parameters)
import java.util.*;
class FunDemo7
{
	int surfaceArea(int l,int b,int h)
	{
		return(2*(l*b+b*h+h*l));
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		FunDemo7 fd7=new FunDemo7();
		System.out.println("Enter a number  for print table : ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int sa=fd7.surfaceArea(l,b,h);
		System.out.println("Surface area of cuboid ="+sa);
	}
}