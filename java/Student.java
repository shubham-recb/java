public class Student{
	String name;
	public Student(){
		System.out.println("constructor is called");
	}
	public static void main(String args[]){
		Student s;
		s=new Student();
		s.name="Shubham Kanujiya";
		System.out.println("s.name");
	}
}