//WAP in java to display total marks of 5 student using studentd Class give the following attributes RegNo(int), name(String),Marks in subject(Integer Array),Total(int).
import java.util.*;
class Student
{
	int j;
	int RegNo;
	String name;
	int mark[]=new int[5];
void insert(int r,String n,int i,int k)
{
	RegNo=r;
	name=n;
	mark[j]=i+k;
	j++;
	
}
void display()
{
	System.out.println("RegNo : "+RegNo+" Name: "+name+" Mark: "+mark[--j]);
	
}

public static void main(String arr[])
{
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	Student s4=new Student();
	Student s5=new Student();
	s1.insert(101,"akhil",60,40);
	s2.insert(102,"akarshit",20,40);
	s3.insert(103,"suresh",50,40);
	s4.insert(104,"anand",39,40);
	s5.insert(105,"amit",60,78);
	s1.display();
	s2.display();
	s3.display();
	s4.display();
	s5.display();
}
}