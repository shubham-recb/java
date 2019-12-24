import java.util.*;
class CommondLine2
{
	public static void main(String [] a)
	{
		int f=1,i,n;
		if(a.length==1)
		{
			n=Integer.parseInt(a[0]);
			for(i=n;i>0;i--)
			{
				f=f*i;
			}
			System.out.println("Factorial of Number="+f);
		}
	}
}