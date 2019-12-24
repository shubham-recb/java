//WAP in java to take sentence from user & now find a word & replace it another word
import java.util.*;
class p19
{
	public static void main(String [] args)
	{
		String sentence,fw,rw;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sentence=sc.nextLine();
		System.out.print("Find What?: ");
		fw=sc.nextLine();
		System.out.print("Replace With: ");
		rw=sc.nextLine();
		System.out.println("Modified Sentence="+sentence.replace(fw,rw));
	}
}