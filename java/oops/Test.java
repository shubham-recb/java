public class Test{
	public static void main(String args[]){
		//Student s=new Student("kanaujiya");
		Student s1=new Student(100);
		Student s2=new Student("some");
		//s.setName("Shubham kanaujiya")
		//System.out.println(s.getName());
		System.out.println(s1.getRoll()+" "+s1.getName());
		System.out.println(s2.getRoll()+" "+s2.getName());
	}
}