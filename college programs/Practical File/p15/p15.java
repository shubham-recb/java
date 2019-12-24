//WAP that import the user defina package and access the member variable of classes that contained by package. 
package mypack;
import userpack.*;
class p15
{
	public static void main(String args[])
	{
		A obj=new A();
		System.out.println("Sum of variable = "+obj.sum(10,20));		
	}
}