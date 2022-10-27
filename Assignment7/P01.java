// Write a java program to create Thread by extending the Thread class.

public class P01 extends Thread {
    public void run() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        P01 obj = new P01();
        obj.start();
    }
}

// OUTPUT
// Thread is running!