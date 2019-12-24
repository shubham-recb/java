//WAP in java to using Method overloading for many main function
class Main
{
	public static void main()
	{
		System.out.println("Inside main function without arguments");
	}
	public static void main(String shubham[])
	{
		main();
		System.out.println("Inside main with String arguments");
		main("Shubham");
	}
	public static void main(String s)
	{
		System.out.println("Inside main with s");
	}
}