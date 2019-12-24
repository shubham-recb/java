//WAP in java for word counter
import java.util.*;
class p20
{
	public static void main(String [] args)
	{
		String sentence;
		System.out.print("Enter a sentence: ");
		Scanner sc=new Scanner(System.in);
		sentence=sc.nextLine();
		String []words=sentence.split(" ");
		System.out.print("No. of word="+words.length);
	}
}