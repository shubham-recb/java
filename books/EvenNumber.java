//WAP in java to find series of even numebr 1-100
class EvenNumber
{
	public static void main(String [] args)
	{
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
			i++;
		}
	}
}