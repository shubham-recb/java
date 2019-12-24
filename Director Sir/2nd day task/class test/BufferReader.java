import java.io.*;
class BufferReader
{
	public static void main(String [] args) throws IOException
	{
		System.out.println("Enter a number for print table");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}