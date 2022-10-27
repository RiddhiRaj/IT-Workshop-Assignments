//Write a Java Program to Check a Thread is Alive or Not.

public class P09 {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
    }
}

// Output:
// false
// true

