//Write a Java Program to Get the Name of a Running Thread. 

public class P10 {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getName());
        t.start();
        System.out.println(t.getName());
    }
}

// Output:
// Thread-0
// Thread-0