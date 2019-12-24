public class Binarytod{
	public static void main(String args[]){
		int n=10101;
		int i=1,sum=0;
		while(n!=0){
			sum+=(n%10)*i;
			i*=2;
			n=n/10;
		}
			System.out.println(sum);
		
	}
	
}