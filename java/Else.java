public class Else{
	public static void main(String args[]){
		int a, b, c;
		a=10;
		b=5;
		c=3;
		if(a>b&&a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a&&c>b)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("sorry");
		}
	}
}