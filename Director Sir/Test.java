//Create a class name "Test " & make a method getrectArea() & call into main method.
import java.util.*;
class Test
{
public void getrectArea()
{
Scanner sc=new Scanner(System.in);
int l,b,area;
System.out.print("Enter length and breadth");
l=sc.nextInt();
b=sc.nextInt();
area=l*b;
System.out.println("area="+area);
}
public static void main(String[] args)
{
Test t=new Test();
t.getrectArea();
}
}