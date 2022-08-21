class P9 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("\nBefore Swapping:\nx = " + a + "\ty = " + b + "\n");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\nAfter Swapping:\nx = " + a + "\ty = " + b + "\n");
    }
}