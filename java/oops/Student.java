public class Student{
	private String name;
	private int roll;
	public Student(){
		System.out.println("constructor is called");
	}
	public Student(String name){
		//this();
		this.name=name;
	}
	public Student(int roll){
		this("kanaujiya");
		this.roll=roll;
	}
	public void setRoll(int roll)
	{this.roll=roll;}
	public int getRoll()
	{return roll;}
	public void setName(String s)
	{name=s;}
	public String getName()
	{return name;}
}