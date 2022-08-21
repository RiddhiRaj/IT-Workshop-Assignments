public class P4 {
    public int fact(int n){
		if(n == 1)
			return(1);
		else
			return(n * fact(n-1));
	}
	public static void main(String []args){
		int x = 7;
		P4 obj = new P4();
		System.out.println("\nFactorial of " + x + " = " + obj.fact(x) + "\n");
	}
}
