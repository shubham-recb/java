class Multiplication1{
	int a,b,mult=0;
	void insert(int a,int b){}
	void display(){
		mult=a*b;
		System.out.println(mult);
		}
		public static void main(String args[]){
			Multiplication1 m1=new Multiplication1();
			m1.insert(2,3);
			m1.display();
		}
}