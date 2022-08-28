public class P7 {
    public static void main(String[] args) {
        P7 obj = new P7();
        int k = obj.sum(4,6);
        System.out.println("Here is the returned value: " + k);
        obj.display();
    }
    public int sum(int a, int b) {
        return a + b;
    }
    public void display() {
        System.out.println("Hello World");
    }
}
