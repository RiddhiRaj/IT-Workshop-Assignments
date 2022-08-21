class P8{
	public int max(int x, int y, int z){
		if(x > y){
			if(x > z)
				return(x);
			else
				return(z);
		}
		else{
			if(y > z)
				return(y);
			else
				return(z);
		}
	}
	public static void main(String []args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		P8 obj = new P8();
		System.out.println("\nMaximum of " + a + ", " + b + " and " + c + " is " + obj.max(a, b, c) + "\n");
	}
}