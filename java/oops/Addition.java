public class Addition{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	public double sum(double a,double b){
		return(a+b);
	}
	public static void main(String args[]){
		Addition a1=new Addition();
		a1.sum(5,7);
		System.out.println(a1.sum(5.2,6.3));
		}
}