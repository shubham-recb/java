//WAP in java of word counter.
import java.util.*;
class p20
{
	public static void main(String [] args)
	{
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		sentence=sc.nextLine();
		String [] words=sentence.split(" ");
		System.out.println("No.of words="+words.length);
	}
}