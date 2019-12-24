class Animal{
	public void eating(){
		System.out.println("eating");
	}
}
class Dog extends Animal{
	public void eating()
	{
		System.out.println("dog is eating");
	}
}
class test{
	public static void main(String args[]){
		Dog d=new Dog();
		d.eating();
	}
}