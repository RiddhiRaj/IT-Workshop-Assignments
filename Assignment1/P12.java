public class P12 {
    public static void main(String[] args) {
        //check if a number is divisble by 5 or not
        int a = Integer.parseInt(args[0]);
        if (a % 5 == 0) {
            System.out.println(a + " is divisible by 5\n");
        } else {
            System.out.println(a + " is not divisible by 5\n");
        }
    }
}
