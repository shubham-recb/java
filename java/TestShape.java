abstract class Shape{
	abstract String getName();
	abstract void setName(String n);
}
class Rectangle extends Shape{
	String name;
	Rectangle(String name){
		this.setName(name);
	}
	void setName(String n){
		this.name=n;
	}
	String getName()
	{
		return name;
	}
}
class TestShape{
	public static void main(String args[]){
		Rectangle r=new Rectangle("Somethig");
		System.out.println(r.getName());
	}
} 