class Rectangle1{
	int height;
	int width;
	void insert(int h,int w){
		height=h;
		width=w;
	}
	void calculateArea()
	{
		System.out.println(height*width);
	}
	public static void main(String args[]){
		Rectangle1 r1=new Rectangle1();
		Rectangle1 r2=new Rectangle1();
		r1.insert(4,5);
		r2.insert(4,6);
		r1.calculateArea();
		r2.calculateArea();
		
	}
}