public class P5 {
    public static void main(String[] args) {
        int x = 5;
		Factorial obj = new Factorial();
		System.out.println("\nFactorial of " + x + " = " + obj.fact(x) + "\n");
    }
}

class Factorial{
	public int fact(int n){
		if(n == 1)
			return(1);
		else
			return(n * fact(n-1));
	}
}