//WAP in java to take fine name from user and print sorted order
import java.util.*;
class p15
{
	public static void main(String [] args)
	{
		String []names=new String[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr five name: ");
		for(i=0;i<5;i++)
		{
			names[i]=sc.nextLine();
		}
		Arrays.sort(names);
		System.out.println("Name is sorted order: ");
		for(i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
	}
}