class AdditionN{
	int a,b,sum=0;
	void insert(int a,int b){}
	void display(){
		sum=a+b;
		System.out.println(sum);
	}
	public static void main(String args[]){
		AdditionN a1=new AdditionN();
		a1.insert(2,5);
		a1.display();
	}
}