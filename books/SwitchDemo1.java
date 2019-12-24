//wAP in java using switch case
import java.util.*;
class SwitchDemo1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		switch(a)
		{
			case 'A':System.out.println("Shivam");break;
			case 5*4:System.out.println("Shubham");break;
			case 60/2:System.out.println("Satyam");break;
			case 40:System.out.println("Shiva");break;
			default:System.out.println("......Bye....Bye.....");break;
		}
	}
}