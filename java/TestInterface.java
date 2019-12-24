interface Account{
	void getuserName(String n);
}
interface Loan{
	void getuserName(String n);
}
class TestInterface implements Account,Loan{
	public void getuserName(String n){
		System.out.println("userName"+n);
	}
	public static void main(String args[]){
			TestInterface t=new TestInterface();
			t.getuserName("Prateek Agrahari");
	}
}