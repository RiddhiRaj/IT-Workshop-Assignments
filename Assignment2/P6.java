//implementation of returning the value from the caller method
public class P6 {
    public static void main(String[] args) {
        P6 obj = new P6();
        int k = obj.add(10, 20);
        System.out.println("Returned sum is: " + k);
    }
    public int add(int a, int b) {
        return a + b;
    }
}
